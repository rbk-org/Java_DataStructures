public class Queue {
   int[] arr =new int[3];
   int counter =0;
   int count2 =0;


    public void push(int pushedElement){
       if(size>=3)
       { System.out.println("overflow");
   }
     else arr[size++]= pushedElement;
    }



    public void pop(){
      arr[i] = arr[i+1];
     counter--;
    }


    public void display(){
     for (int i = 0; i <arr.length; i++) {
      System.out.println(arr[i]);
     }
    }

}