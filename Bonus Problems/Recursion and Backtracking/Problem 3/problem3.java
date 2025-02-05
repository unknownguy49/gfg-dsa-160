class Solution {
    // Function to find all combinations of elements
    // in array arr that sum to target.
    static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target) {
        // add your code here
        Arrays.sort(arr);

        ArrayList<Integer> cur=new ArrayList<>();
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        makeCombination(arr,target,cur,res,0);

        return res;
    }
    
    static void makeCombination(int arr[],int remSum,ArrayList<Integer> cur,ArrayList<ArrayList<Integer>> res,int index) 
    {
        if(remSum==0) 
        {
            res.add(new ArrayList<>(cur));
            return;
        }

        if(remSum<0 || index>=arr.length)
        return;
        
        cur.add(arr[index]);
        makeCombination(arr,remSum-arr[index],cur,res,index);
        cur.remove(cur.size()-1);

        makeCombination(arr,remSum,cur,res,index+1);
    }
}