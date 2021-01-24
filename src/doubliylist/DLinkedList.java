
package doubliylist;

public class DLinkedList {
 Node head;
 Node tail;
 
public DLinkedList(){
  //this.head=head;
  //this.tail=tail; 
}
public void insertNode(int data) {
 Node newNode=new Node(data);
 
 if(head == null){
 head=tail=newNode;
 head.prev=null;
 tail.next=null;
 }
 else{
  tail.next=newNode;   
  newNode.prev=tail;
  tail=newNode;
  tail.next=null;
 }
  
}

public void insertLast(int data) {
 Node newNode=new Node(data);
 if(tail == null){
  tail=head=newNode;
  tail.next=newNode;
  tail.prev=null;
 }
 if(head==null){
  head=newNode;
 }

}
public void delet(int position){
Node prev =null;    
Node current=head;
int i=0;
//position means we need delet it
while(i<position){
  prev=current;
  current=current.next;
   i++;
   }
 if(prev!=null) {
   prev.next=current.next; 
 }
   if(current.next !=null){
      current.next.prev=prev;
   }  
     
   
 else{
   head=current.next;
   head.prev=null;
 }   


}

public void showList(){
  Node temp=head;
  while(temp!= null){
      System.out.println(temp.data);
      temp=temp.next;
  } 
      
}
 
 
}


