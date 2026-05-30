import java.util.*;
public class Exception{
public static void main(String args[]){
try{
  try{
            int a=10/0;
     }
     catch(ArithmeticException e){
         System.out.println("cannot divide by zero:");
      }
  int am[] = new int[5];
  am[10]=20;
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("array out of bound:");
}
}
}