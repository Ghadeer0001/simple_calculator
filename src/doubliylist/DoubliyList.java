
package doubliylist;

//import doubliylist.DLinkedList;

public class DoubliyList {

    public static void main(String[] args) {
    DLinkedList myNode= new DLinkedList();
    myNode.insertNode( 2);
     myNode.insertNode( 3);
    myNode.showList();
    
   myNode.delet(2);
    myNode.showList();
   // System.out.println("i do not care");
    }
    
}
