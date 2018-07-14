 import java.util.Arrays;

public class Stack{
 public int []= new int[3];
 public numberelem=0;
 public top=-1;

 public void push(int elem){
    if(numberelem<3){
     arr[top+1]=elem;
     top++;
        } 
     }
     else{
         System.out.println("stack is full "); 
     }


   public void pop(){
    if(numberelem>0){
        top--;
      }
    else{
        System.out.println("stack is empty "); 
    }
   }



}



