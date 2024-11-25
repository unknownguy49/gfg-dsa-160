class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int r[]=new int[arr.length];
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            d=d%arr.length;
            int pos=i+d;
            if(!(pos>arr.length-1))
            r[i]=arr[pos];
            else
            {
                r[i]=arr[c];
                c++;
            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=r[i];
        }
    }
}