package classgeneric;

    /*
  int data1;
  int data2;


public MyClass(int data1, int data2){
    
   this.data1=data1;
   this.data2=data2;
}
  public int GetData1(){
            return data1;
        }
        public int GetData2(){
            return data2;
        }
        public  void SetData( int newData1){
            data1 = newData1;
        }
        public void SetData2(int  newData2){
            data2 = newData2;
        }
*/
    public class MyClass<T> {
    T data1;
    T data2;
    
    public MyClass(T data1, T data2){
    
   this.data1=data1;
   this.data2=data2;
    }
   public T GetData1(){
            return this.data1;
        }
        public T GetData2(){
            return this.data2;
        }
        public  void SetData1( T newData1){
            data1 = newData1;
        }
        public void SetData2(T  newData2){
            data2 = newData2;
        }
   
   
   
   
}

