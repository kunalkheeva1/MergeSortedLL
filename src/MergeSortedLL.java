

public class MergeSortedLL {
   static class Node{
       int data;
       Node next;
       Node(int data){
           this.data = data;
           this.next = null;
       }
   }
   //creating a method to get my resultant nodes as sorted
    public static Node mergeSortedLL(Node n1, Node n2){
       if(n1==null){
           return n2;
       }
       if(n2 == null){
           return n1;
       }
       Node head = new Node(0);
       Node temp = head;
       while(n1!= null || n2!= null) {
           if (n2.data > n1.data) {
               temp.next = n1;
               temp = temp.next;
               head = head.next
           } else {
               temp.next = n2;
               temp = temp.next;
               head = head.next;
           }
       }
           if(n1 != null){
               temp.next = n1;
           }
           if(n2 != null){
               temp.next = n2;
           }return head.next;
       }

    public static void main(String[] args) {

    }
}
