class Base{
void display(){
System.out.println("parent class");
}
}
class Derived extends Base{
void display(){
    super.display();
System.out.println("child class");
}
}
public class Moverr{
public static void main(String args[]){
Derived d = new Derived();
d.display();
}
}
