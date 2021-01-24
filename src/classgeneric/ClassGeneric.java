
package classgeneric;


public class ClassGeneric {

   
    public static void main(String[] args) {
        /*// this folloe the class ordinary without generic
     MyClass class1=new MyClass(10,34);
     class1.SetData(11);
     System.out.println(class1.GetData1());
*/
  //difintion generic
  MyClass<Integer> class1=new MyClass<>(10,23);
       
   System.out.println(class1.GetData1());
    System.out.println(class1.GetData2());     
        
        
    }
    
}
