import java.util.Arrays;


public class Queue{

int [] arr=new int [3];
  int front=0;
  int rear=0;
  int numberelem=0;
     

     public void push(int elem){
     if(numberelem<3){
      arr[rear]=elem;
      rear++;
      numberelem++;
                 
        }
        else {
          System.out.println("overflow");
        }
      }


    public void pop(){
         if(numberelem>0){
          arr[front]="-1";
          front++;
          numberelem--;
         }
         else{
          System.out.println("queue is empty");
         }
   

    }

    public void display(){
      for(int i=0;i<3;i++){
        System.out.println(arr[i]);
      }
    }
}