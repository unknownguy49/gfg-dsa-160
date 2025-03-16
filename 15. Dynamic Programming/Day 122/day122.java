class Solution {
    static int minJumps(int[] arr) {
        // code here
        if(arr[0]==0)
        return -1; 
        int jumps=0,pos=0,dest=0; 
        for(int i=0;i<arr.length-1;i++)
        { 
            dest=Math.max(dest,i+arr[i]); 
            if(i==pos)
            { 
                jumps++; 
                pos=dest; 
                if(pos>=arr.length-1)
                break; 
            } 
        } 
        return pos>=arr.length-1?jumps:-1;
    }
}