
package factorial;
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     System.out.println("Enter a number");
     int n=input.nextInt();
     int result=Factorial(n);
     System.out.println(result);
    }
    public static int Factorial(int n){
      if(n==0)  
        return 1;
      else 
        return n*Factorial(n-1);
        
    }
    
}
/*
public int removeFirst(){

if(head==null)
    return null;
else{

Node temp=head;
head=head.GetNext();
temp.SetNext(null);
size=size-1;
return temp.GetData;
}
}

*/
/*
public void addFirst(int data){
Node newNode=new Node(data);
newNode.next=head;
head=newNode;

}
*/
/*
//swap in singlrLinked


public void swapNodes(int x, int y) 
    { 
        // Nothing to do if x and y are same 
        if (x == y) return; 
  
        // Search for x (keep track of prevX and CurrX) 
        Node prevX = null, currX = head; 
        while (currX != null && currX.data != x) 
        { 
            prevX = currX; 
            currX = currX.next; 
        } 
  
        // Search for y (keep track of prevY and currY) 
        Node prevY = null, currY = head; 
        while (currY != null && currY.data != y) 
        { 
            prevY = currY; 
            currY = currY.next; 
        } 
  
        // If either x or y is not present, nothing to do 
        if (currX == null || currY == null) 
            return; 
  
        // If x is not head of linked list 
        if (prevX != null) 
            prevX.next = currY; 
        else //make y the new head 
            head = currY; 
  
        // If y is not head of linked list 
        if (prevY != null) 
            prevY.next = currX; 
        else // make x the new head 
            head = currX; 
  
        // Swap next pointers 


*/
/*
public void traverse(){
Node temp=head;
while(true){
  if(temp ==null)
  break;
}
System.out.println(temp.GetData())
temp=temp.GetNext();
}
}
public void reverse(){
Node prev =null;
Node current=head;
Node next=null;
while(current != null){
next=current.GetNext();
current.SetNext(prev);
prev=current;
current=next;
}
head=prev;

}
*/