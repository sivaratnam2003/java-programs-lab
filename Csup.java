class A{
A(int i){
System.out.println("base parameterised"+i);
}
}
class Be extends A{
Be(){
super(100);
System.out.println("child default");}
}
public class Csup{
public static void main(String args[]){
Be ob = new Be();
}
}
