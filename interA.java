interface A{
int a=10;
void show();}
interface B{
int a=40;
void show();}
class Cc implements A,B{
int c;
public void show(){
c=A.a+B.a;
System.out.println("sum:"+c);
}
}
public class interA{
public static void main(String args[]){
Cc ob= new Cc();
ob.show();
}
}