import java.util.*;
public class Sampleelse{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("enter a number:");
int n = s.nextInt();
if(n%2==0){
System.out.println("Even number:"+ n);
}
else{
System.out.println("odd number:"+ n);
}
}
}