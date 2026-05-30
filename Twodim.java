import java.util.*;
public class Twodim{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter size of row and col array");
int r = s.nextInt();
int c = s.nextInt();
int a[][]=new int[r][c];
System.out.println("Enter array elements");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
a[i][j]=s.nextInt();
}
}
System.out.println("the elements are");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
System.out.print(a[i][j]+" ");
}
}
System.out.println();
} 
} 