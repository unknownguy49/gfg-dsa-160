class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int n=arr.length;
        int c=0;

        for (int i=0;i<n-2;i++) 
        {
            int left=i+1;
            int right=n-1;

            while(left<right) 
            {
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==target) 
                {
                    if(arr[left]==arr[right]) 
                    {
                        int numElements=right-left+1;
                        c+=(numElements*(numElements-1))/2;
                        break;
                    } 
                    else 
                    {
                        int leftCount=1;
                        int rightCount=1;

                        while(left<right && arr[left]==arr[left+1]) 
                        {
                            leftCount++;
                            left++;
                        }

                        while(left<right && arr[right]==arr[right-1]) 
                        {
                            rightCount++;
                            right--;
                        }

                        c+=leftCount*rightCount;

                        left++;
                        right--;
                    }
                } 
                else if(sum<target)
                left++;
                else
                right--;
            }
        }

        return c;
    }
}