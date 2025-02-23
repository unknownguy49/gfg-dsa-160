class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int next=-1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[i])
                {
                    next=arr[j];
                    break;
                }
            }
            res.add(next);
        }
        return res;
    }
}