
package bubblesort;
import java.util.Scanner;

public class BubbleSort {

    
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a size for array");
    int n=input.nextInt();
    int numbers[]=new int[n];
    for(int i=0; i<n;i++){
     System.out.println("Enter item for array ["+i+"]");   
     numbers[i] =input.nextInt();
      }
    System.out.println("the elements after sorting");
  
      BubbleSort(numbers);
      
      for(int i=0;i<n;i++)
       System.out.println(numbers[i]);
    }
    // function to sort array using Bubble sort
    public static void BubbleSort( int numbers [] ){
    int n=numbers.length;
    for (int i=0; i<n-1;i++)
       for (int j=0 ; j<n-(i+1) ; j++){
         if (numbers [j]>numbers [j+1])
    {
     //swap numbers [j+1] and numbers [j]
    int temp=numbers [j];
    numbers [j]=numbers [j +1];
    numbers [j+1]=temp;
 }

    }   
}
}