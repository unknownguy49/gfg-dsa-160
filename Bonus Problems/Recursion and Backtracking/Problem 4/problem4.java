class Solution {
    // Function to find all combinations of elements
    // in array arr that sum to target.
    static ArrayList<ArrayList<Integer>> uniqueCombinations(int[] arr, int target) {
        // add your code here
        Arrays.sort(arr);
        
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<>();
        findCombinations(arr,0,target,curr,res);
        
        return res;
    }
    
    static void findCombinations(int arr[],int index,int target,ArrayList<Integer> curr,ArrayList<ArrayList<Integer>> res) 
    {
        if(target==0) 
        {
            res.add(new ArrayList<>(curr));
            return;
        }

        if(target<0 || index>=arr.length) 
        return;

        for(int i=index;i<arr.length;i++) 
        {
            if(i>index&&arr[i]==arr[i-1])
            continue;

            curr.add(arr[i]);
            findCombinations(arr,i+1,target-arr[i],curr,res);
            curr.remove(curr.size()-1);
        }
    }
}