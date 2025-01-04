class Solution {
    public int countSum(int arr[], int target) {
        // code here
        int c=0;
        int n=arr.length;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n-1;i++) 
        {
            for(int j=i+1;j<n;j++) 
            {
                int temp=arr[i]+arr[j];
                c+=map.getOrDefault(target-temp,0);
            }

            for(int j=0;j<i;j++) 
            {
                int temp=arr[i]+arr[j];
                map.put(temp,map.getOrDefault(temp,0)+1);
            }
        }
        return c;
    }
}