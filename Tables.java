import java.util.*;
public class Tables{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter a number");
int n = s.nextInt();
System.out.println("Range:");
int r= s.nextInt();
for(int i=1;i<=r;i++){
System.out.println(n+"*"+i+"=" + n*i);
}
}
}