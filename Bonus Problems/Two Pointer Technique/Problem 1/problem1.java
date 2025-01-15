class Solution {
    // Should return true if there is a triplet with sum equal
    // to x in arr[], otherwise false
    public static boolean hasTripletSum(int arr[], int target) {
        // Your code Here
        int n=arr.length;
        Arrays.sort(arr);
        
        for(int i=0;i<n-2;i++) 
        {
            
            int l=i+1,r=n-1;
            int requiredSum=target-arr[i];
            while(l<r) 
            {
                if(arr[l]+arr[r]==requiredSum)
                return true;
                
                if(arr[l]+arr[r]<requiredSum)
                l++;
                
                else if(arr[l]+arr[r]>requiredSum)
                r--;
            }
        }

        return false;
    }
}