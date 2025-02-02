class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if(root==null)
        return result;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int levelSize=queue.size();
            ArrayList<Integer> level=new ArrayList<>();
            for(int i=0;i<levelSize;i++)
            {
                Node currentNode=queue.poll();
                level.add(currentNode.data);
                if(currentNode.left!=null)
                queue.add(currentNode.left);
                if(currentNode.right!=null)
                queue.add(currentNode.right);
            }
            result.add(level);
        }
        return result;
    }
}