class LRUCache {
    // Constructor for initializing the cache capacity with the given value.
    private final int capacity;
    private final Map<Integer,Integer> cache;
    private final LinkedHashMap<Integer,Integer> order;
    
    public LRUCache(int cap) {
        // code here
        this.capacity=cap;
        this.cache=new HashMap<>();
        this.order=new LinkedHashMap<>(cap, 0.75f, true)
        {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest)
            {
                return size()>capacity;
            }
        };
    }

    // Function to return value corresponding to the key.
    public int get(int key) {
        // your code here
        if(!cache.containsKey(key))
        return -1;
        order.get(key);
        return cache.get(key);
    }

    // Function for storing key-value pair.
    public void put(int key, int value) {
        // your code here
        if(cache.containsKey(key))
        {
            cache.put(key,value);
            order.get(key);
        } 
        else 
        {
            if(cache.size()>=capacity)
            {
                int eldestKey=order.keySet().iterator().next();
                cache.remove(eldestKey);
                order.remove(eldestKey);
            }
            cache.put(key,value);
            order.put(key,value);
        }
    }
}