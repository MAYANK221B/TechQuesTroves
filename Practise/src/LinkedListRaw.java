public class LinkedListRaw {
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
          data = d ;
        }
    }


    public LinkedListRaw insertFirst(LinkedListRaw list,int d ){

        Node node = new Node(d);

        if(list.head == null){
            head = node;
        }
        else{
            node.next = head;
            head = node;
        }
        return list;

    }

    public void display(LinkedListRaw list){
        Node node = list.head;
        while(node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public LinkedListRaw reverse(LinkedListRaw list){
        Node prev = null;
        Node next = null;
        Node curr = list.head;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        list.head = prev;
        return list;


    }

    public static void main(String[] args){
        LinkedListRaw list = new LinkedListRaw();
        list = list.insertFirst(list,10);
        list = list.insertFirst(list,9);
        list = list.insertFirst(list,8);
        list = list.insertFirst(list,7);
        list = list.reverse(list);
        list.display(list);




    }

}
