class Solution {
    static ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        // add your code here
        HashMap<Integer,ArrayList<Integer>> mp=new HashMap<>();
        int mn[]={0}; 

        DFS(root,0,mn,mp);
        
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int hd=mn[0];

        while(mp.containsKey(hd)) 
        {
            res.add(mp.get(hd));
            hd++;
        }
        return res;
    }
    
    static void DFS(Node root,int hd,int mn[],HashMap<Integer,ArrayList<Integer>> mp) 
    {
        if(root==null) 
        return;
        
        if(!mp.containsKey(hd)) 
        mp.put(hd,new ArrayList<>());
        
        mp.get(hd).add(root.data);
        
        mn[0]=Math.min(mn[0],hd);
        
        DFS(root.left,hd-1,mn,mp);
        DFS(root.right,hd+1,mn,mp);
    }
}