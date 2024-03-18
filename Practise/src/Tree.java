import java.util.*;
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node)
    {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Node> s = new Stack();
        Queue<Node> q = new LinkedList();

        q.add(node);

        while(!q.isEmpty()){
            Node temp = q.peek();
            q.remove();
            arr.add(temp.data);


            if(temp.right!=null){
                q.add(temp.right);
            }
            if(temp.left!=null)
                q.add(temp.left);
            }



        Collections.reverse(arr);
        return arr;

    }
}
