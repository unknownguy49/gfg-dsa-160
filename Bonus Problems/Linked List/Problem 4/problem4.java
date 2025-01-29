class Solution {
    // Function to flatten a linked list
    
    class NodeComparator implements java.util.Comparator<Node> 
    {
        @Override
        public int compare(Node a,Node b) 
        {
            return Integer.compare(a.data,b.data);
        }
    }
    
    Node flatten(Node root) {
        // code here
        PriorityQueue<Node> pq=new PriorityQueue<>(new NodeComparator());

        Node head=null;
        Node tail=null;

        while(root!=null) 
        {
            pq.add(root);
            root=root.next;
        }

        while(!pq.isEmpty()) 
        {
            Node minNode=pq.poll();

            if(head==null) 
            {
                head=minNode;
                tail=minNode;
            } 
            else 
            {
                tail.bottom=minNode;
                tail=tail.bottom;
            }
            if(minNode.bottom!=null) 
            {
                pq.add(minNode.bottom);
                minNode.bottom=null;
            }
        }
        return head;
    }
}