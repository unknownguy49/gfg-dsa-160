class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        List <int[]> merged=new ArrayList<>();
        if(arr.length==0)
        return merged;
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        merged.add(arr[0]);
        for(int i=1;i<arr.length;i++) 
        {
            int[] current=arr[i];
            int[] lastMerged=merged.get(merged.size()-1);
            if(lastMerged[1]>=current[0]) 
            lastMerged[1]=Math.max(lastMerged[1],current[1]);
            else
            merged.add(current);
        }
        return merged;
    }
}