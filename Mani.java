import java.util.*;
class Student{
int rollno;
String name;//data members or instance variables
public Student(int r,String n){
rollno=r;
name=n;}
void display(){
System.out.println("ROLLNUMBER IS:"+rollno);
System.out.println("name of student:"+name);
}
}
public class Mani{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter Roll number");
int r = s.nextInt();
s.nextLine();
System.out.println("Enter name");
String n=s.nextLine();
System.out.println("Enter Roll number");
int r1 = s.nextInt();
s.nextLine();
System.out.println("Enter name");
String n1=s.nextLine();
System.out.println("Enter Roll number");
int r2 = s.nextInt();
s.nextLine();
System.out.println("Enter name");
String n2 =s.nextLine();
Student s1= new Student(r,n);
Student s2= new Student(r1,n1);
Student s3= new Student(r2,n2);
s1.display();
s2.display();
s3.display();
}}
