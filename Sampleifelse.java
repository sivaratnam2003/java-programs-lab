import java.util.*;
public class Sampleifelse{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("enter a numbers:");
int a = s.nextInt();
int b = s.nextInt();
int c = s.nextInt();
if(a>b && a>c){
System.out.println("Big is :"+ a);
}
else if(b>a && b>c){
System.out.println("Big:"+ b);
}
else{
System.out.println("Big:"+ c);
}
}
}