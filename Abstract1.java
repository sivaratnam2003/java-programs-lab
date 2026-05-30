abstract class Animal{
abstract void sound();
void sleep(){
System.out.println("sleeping");
}}
class Dog extends Animal{
public void sound(){
System.out.println("dog barks");
}
}
public class Abstract1{
public static void main(String args[]){
Dog d = new Dog();
d.sound();
d.sleep();
}
}
 
