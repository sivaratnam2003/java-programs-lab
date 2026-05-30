import java.util.*;
class Student{
int pin;
String name;
double percentage;
Student(int pin,String name,double percentage){
this.pin = pin;
this.name = name;
this.percentage = percentage;
}
}
public class Search{
public static void main(String args[]){
ArrayList<Student> stu = new ArrayList<Student> ();
stu.add(new Student(1,"siva",98.5));
stu.add(new Student(2,"mani",78.5));
stu.add(new Student(3,"teja",85.5));
Scanner s = new Scanner(System.in);
System.out.println("Enter pin number:");
int p = s.nextInt();
boolean found = false;
for(Student s1:stu){
if(s1.pin == p){
System.out.println("name:"+s1.name);
System.out.println("percentage:"+s1.percentage);
found = true;
break;
}
}
if(!found){
System.out.println("student not found:");
}
}
}