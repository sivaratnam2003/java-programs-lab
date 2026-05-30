class Base{
int a=20;
}
class Derived extends Base{
int b=40;
void display(){
System.out.println("child class"+b);
System.out.println("parent class"+super.a);

}
}
public class Msup{
public static void main(String args[]){
Derived d = new Derived();
d.display();
}
}
