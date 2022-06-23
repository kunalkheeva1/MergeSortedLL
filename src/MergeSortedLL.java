

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
       //node of new list
       Node head = new Node(0);
       Node temp = head;

       //until both gets null
       while(n1!= null && n2!= null) {

           //whichever have smaller data will be added in temp and move forward
           if (n2.data > n1.data) {
               temp.next = n1;
               temp = temp.next;
               head = head.next;
           } else {
               temp.next = n2;
               temp = temp.next;
               head = head.next;
           }
       }
       //remaining element will be added accordingly
           if(n1 != null){
               temp.next = n1;
           }
           if(n2 != null){
               temp.next = n2;
               //return head.next as head was initialize with 0
           }return head.next;
       }

    public static void main(String[] args) {

    }
}
