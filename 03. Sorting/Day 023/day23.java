class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        return mergeSortAndCount(arr,0,arr.length-1);
    }
    static int mergeSortAndCount(int[] arr,int left,int right) {
        int count=0;
        if(left<right) 
        {
            int mid=(left+right)/2;
            count+=mergeSortAndCount(arr,left,mid);
            count+=mergeSortAndCount(arr,mid+1,right);
            count+=mergeAndCount(arr,left,mid,right);
        }
        return count;
    }
    static int mergeAndCount(int[] arr,int left,int mid,int right) {
        int[] temp=new int[right-left+1];
        int i=left,j=mid+1,k=0;
        int count=0;
        while(i<=mid&&j<=right) 
        {
            if(arr[i]<=arr[j]) 
            temp[k++]=arr[i++];
            else 
            {
                temp[k++]=arr[j++];
                count+=(mid-i+1);
            }
        }
        while(i<=mid)
        temp[k++]=arr[i++];
        while(j<=right) 
        temp[k++]=arr[j++];
        for(i=0;i<temp.length;i++) 
        {
            arr[left+i]=temp[i];
        }
        return count;
    }
}