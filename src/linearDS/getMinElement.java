package linearDS;

public class getMinElement {
   int []arr;
    int ptr;
   int size;
   int min;
   getMinElement(int size){
       this.arr=new int[size];
       this.ptr=-1;
       min=Integer.MIN_VALUE;
   }

   void push(int val){
       if (isFull()){
           System.out.println("Stack OverFlow");
           return;
       }
       if(isEmpty()){
           min=val;
       }
       else{
           min=Math.min(min,val);
       }
       System.out.print(val+" ");
       arr[++ptr]=val;

   }
   int pop(){
       if(isEmpty()){
           System.out.println("Stack underFlow");
           return -1;
       }
       int x=arr[ptr--];
       if (x==min){
           min=Integer.MAX_VALUE;
           for (int i=0;i<=ptr;i++){
               min=Math.min(min,arr[i]);
           }
       }
       return x;
   }

   int getMin(){
       if (isEmpty()){
           System.out.println("Stack is empty");
       return -1;
       }
       return min;
   }
   boolean isFull(){
       return ptr==size-1;
   }
   boolean isEmpty() {
       return ptr == -1;
   }

    public static void main(String[] args) {
getMinElement get=new getMinElement(15);
get.push(5);
        get.push(10);
        get.push(3);
        get.push(13);

        System.out.println("Get min --> "+get.getMin());
    }
}
