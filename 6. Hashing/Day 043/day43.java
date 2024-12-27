class Solution {

    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        int count=0;
        while(left<right) 
        {
            int sum=arr[left]+arr[right];
            if(sum==target) 
            {
                if(arr[left]==arr[right]) 
                {
                    int numPairs=(right-left)*(right-left+1)/2;
                    count+=numPairs;
                    break;
                }
                int leftCount=1,rightCount=1;
                while(left+1<right && arr[left]==arr[left+1]) 
                {
                    leftCount++;
                    left++;
                }
                while(right-1>left && arr[right]==arr[right-1]) 
                {
                    rightCount++;
                    right--;
                }
                count+=leftCount*rightCount;
                left++;
                right--;
            } 
            else if (sum < target)
            left++;
            else
            right--;
        }
        return count;
    }
}