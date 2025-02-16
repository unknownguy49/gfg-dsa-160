class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    public ArrayList<Integer> serialize(Node root) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node node=q.poll();
            if(node!=null)
            {
                arr.add(node.data);
                q.add(node.left);
                q.add(node.right);
            }
            else 
            arr.add(null);
        }
        return arr;
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> arr) {
        // code here
        if(arr.isEmpty()||arr.get(0)==null)
        return null;
        
        Node root=new Node(arr.get(0));
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int i=1;
        while(!q.isEmpty())
        {
            Node node=q.poll();
            if(i<arr.size()&&arr.get(i)!=null)
            {
                node.left=new Node(arr.get(i));
                q.add(node.left);
            }
            i++;
            
            if(i<arr.size()&&arr.get(i)!=null)
            {
                node.right=new Node(arr.get(i));
                q.add(node.right);
            }
            i++;
        }
        return root;
    }
}