class Solution {
    public static int zeroSumSubmat(int[][] mat) {
        // code here
        int rows=mat.length;
        int cols=mat[0].length;
        int maxArea=0;

        for(int i=0;i<rows;i++) 
        {
            int temp[]=new int[cols];

            for(int j=i;j<rows;j++) 
            {
                for(int k=0;k<cols;k++)
                {
                    temp[k]+=mat[j][k];
                }
                int len=maxZeroSumSubarray(temp);
                maxArea=Math.max(maxArea,(j-i+1)*len);
            }
        }
        return maxArea;
    }
    
    static int maxZeroSumSubarray(int arr[]) 
    {
        int prefSum=0;
        int maxLength=0;
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++) 
        {
            prefSum+=arr[i];

            if(prefSum==0) 
            maxLength=i+1;

            if(mp.containsKey(prefSum)) 
            {
                maxLength=Math.max(maxLength,(i-mp.get(prefSum)));
            }
            else 
            {
                mp.put(prefSum, i);
            }
        }

        return maxLength;
    }
} 