
public class SinglyLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
          data = d ;
        }
    }


    public SinglyLinkedList insertFirst(SinglyLinkedList list, int d ){

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

    private SinglyLinkedList insertLast(SinglyLinkedList list, int d){
        Node node = new Node(d);
        Node temp;
        if(list.head == null){
            head = node;
        }
        else{
            temp = list.head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next= node;
        }
        return list;
    }

    private SinglyLinkedList insertAtPosition(SinglyLinkedList list, int d, int i){
        Node node = new Node(d);
        if(list.head == null){
            head = node;
        }
        else {
            Node temp = list.head;
            for(int j=0;j<i;j++)
                temp=temp.next;
            if(temp==null)
                return list;
            else{
                node.next = temp.next;
                temp.next=node;
            }
        }
        return list;
    }

    private SinglyLinkedList deleteFirst(SinglyLinkedList list){
        if(list.head == null)
            return list;
        else {
            head = head.next;
        }
        return list;
    }

    private SinglyLinkedList deleteLast(SinglyLinkedList list){
        if(list.head == null)
            return list;
        else {
            Node temp = list.head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next = null;
        }
        return list;
    }

    private SinglyLinkedList deleteAtPosition(SinglyLinkedList list, int n){
        if(list.head == null)
            return list;
        else {
            Node temp = list.head;
            for(int i =0;i<n-1;i++){
               temp = temp.next;
            }
            temp.next =temp.next.next;
        }
        return list;
    }

    public void display(SinglyLinkedList list){
        Node node = list.head;
        while(node!=null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    /***
     *Method to reverse a linked list
     */
    public SinglyLinkedList reverse(SinglyLinkedList list) {
        Node curr = list.head;
        Node prev = null;
        Node next = curr.next;
        while(curr !=null){
            next= curr.next;
            curr.next =prev;
            prev = curr;
            curr = next;

        }
        head = prev;
        return list;
    }

    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list = list.insertFirst(list,10);
        list = list.insertFirst(list,9);
        list = list.insertFirst(list,8);
        list = list.insertFirst(list,7);
        list = list.insertFirst(list,6);
        list = list.insertFirst(list,5);
        list.display(list);
        list = list.reverse(list);
        list.display(list);
        list = list.insertLast(list, 4);
        list.display(list);
        list = list.insertAtPosition(list, 0, 1);
        list.display(list);
        list = list.deleteFirst(list);
        list.display(list);
        list = list.deleteLast(list);
        list.display(list);
        list = list.deleteAtPosition(list,1);
        list.display(list);
    }
}
