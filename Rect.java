class Rectangle{
double length;
double width;
public Rectangle(double l,double w){//parameterised constructor
length=l;
width=w;
}
public Rectangle(Rectangle r)
{
length=r.length;
width=r.width;
}
double area(){
return length*width;
}

}
public class Rect{
public static void main(String args){
Rectangle r2=new Rectangle(10,20);
Rectangle r3=new Rectangle(r2);
System.out.println(r2.area());
System.out.println(r3.area());
}
}
