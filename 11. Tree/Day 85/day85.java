class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Node> stack=new Stack<>();
        Node curr=root;
        while(curr!=null||!stack.isEmpty()) 
        {
            while(curr!=null) 
            {
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            res.add(curr.data);
            curr=curr.right;
        }
        return res;
    }
}