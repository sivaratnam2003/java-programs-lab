import java.util.*;
public class xception1{
public static void main(String args[]){
try{
int am[] = new int[5];
am[10]=20;}
catch(ArithmeticException e){
System.out.println("cannot divide by zero:");
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("array out of bound:");
}
catch(Exception e){
System.out.println("normal zero:");
}
}
}