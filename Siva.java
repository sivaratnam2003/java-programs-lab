import java.util.*;
class Student{
int rollno;
String name;//data members or instance variables
public Student(int r,String n){
int rollno=r;
String name=n;}
void display(){
System.out.println("ROLLNUMBER IS:"+rollno);
System.out.println("name of student"+name);
}
}
public class Siva{
public static void main(String args[]){
Student s1= new Student(101,"siva");
Student s2= new Student(102,"mani");
Student s3= new Student(103,"kanna");
s1.display();
s2.display();
s3.display();
}
}