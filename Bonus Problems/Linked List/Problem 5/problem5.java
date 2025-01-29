class LFUCache {
    private final int capacity;
    private int minFreq;
    private final Map<Integer, Integer> valueMap;
    private final Map<Integer, Integer> freqMap;
    private final Map<Integer, LinkedHashSet<Integer>> freqListMap;
    
    public LFUCache(int cap) {
        // code here
        this.capacity=cap;
        this.minFreq=0;
        this.valueMap=new HashMap<>();
        this.freqMap=new HashMap<>();
        this.freqListMap=new HashMap<>();
    }

    public int get(int key) {
        // code here
        if(!valueMap.containsKey(key)) 
        return -1;
        int freq=freqMap.get(key);
        freqMap.put(key,freq+1);
        freqListMap.get(freq).remove(key);
        if(freqListMap.get(freq).isEmpty())
        {
            freqListMap.remove(freq);
            if(minFreq==freq) 
            minFreq++;
        }
        freqListMap.computeIfAbsent(freq+1,k->new LinkedHashSet<>()).add(key);
        return valueMap.get(key);
    }

    public void put(int key, int value) {
        // code here
        if(capacity==0) 
        return;
        if(valueMap.containsKey(key))
        {
            valueMap.put(key, value);
            get(key);
            return;
        }
        if(valueMap.size()>=capacity)
        {
            int evict=freqListMap.get(minFreq).iterator().next();
            freqListMap.get(minFreq).remove(evict);
            if(freqListMap.get(minFreq).isEmpty()) 
            freqListMap.remove(minFreq);
            
            valueMap.remove(evict);
            freqMap.remove(evict);
        }
        valueMap.put(key,value);
        freqMap.put(key,1);
        minFreq=1;
        freqListMap.computeIfAbsent(1,k->new LinkedHashSet<>()).add(key);
    }
}