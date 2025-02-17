class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        ArrayList<Integer> newarr=new ArrayList<>();
        Arrays.sort(arr);
        int c=0;
        int len=arr.length;
        
        for(int i=len-1;i>=len-k;i--)
        {
            newarr.add(arr[i]);
        }
        return newarr;
    }
}