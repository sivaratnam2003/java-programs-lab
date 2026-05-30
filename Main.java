class Base{
void display(){
System.out.println("parent class");
}
}
class Derived extends Base{
void display(){
System.out.println("child class");
}
}
public class Main{
public static void main(String args[]){
Derived d = new Derived();
d.display();
}
}
