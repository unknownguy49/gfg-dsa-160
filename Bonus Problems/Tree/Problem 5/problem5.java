class Solution {
    Node balanceBST(Node root) {
        // Add your code here.
        ArrayList<Integer> nodes=new ArrayList<>();
        storeInorder(root,nodes);
        return buildBalancedTree(nodes,0,nodes.size()-1);
    }
    
    static void storeInorder(Node root,ArrayList<Integer> nodes) 
    {
        if(root==null)
        return;

        storeInorder(root.left,nodes);
        nodes.add(root.data);
        storeInorder(root.right,nodes);
    }
    
    static Node buildBalancedTree(ArrayList<Integer> nodes,int start,int end) 
    {
        if(start>end)
        return null;

        int mid=(start+end)/2;
        Node root=new Node(nodes.get(mid));
        
        root.left=buildBalancedTree(nodes,start,mid-1);
        root.right=buildBalancedTree(nodes,mid+1,end);

        return root;
    }
}