import java.util.*;
public class Sumofrange{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter a number");
int n = s.nextInt();
int sum=0;
int i=1;
while(i<=n){
sum=sum+i;
System.out.println("sum of range"+sum);
}
}
}