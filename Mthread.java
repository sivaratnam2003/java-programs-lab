import java.util.*;
class Mnthread extends Thread{
String name;
Mnthread(String n){
name = n;
}
public void run(){
for(int i=1;i<=5;i++){
System.out.println(name+" "+(2*i));
}
}}
public class Mthread{
public static void main(String args[]){
Mnthread t = new Mnthread("ThreadA"); 
Mnthread t1 = new Mnthread("ThreadB"); 
Mnthread t2 = new Mnthread("ThreadC"); 
Mnthread t3 = new Mnthread("ThreadD");
System.out.println("the priority of thread1:"+t.getPriority()); 
System.out.println("the priority of thread2:"+t1.getPriority()); 
System.out.println("the priority of thread3:"+t2.getPriority()); 
System.out.println("the priority of thread4:"+t3.getPriority());
t.setPriority(Thread.MAX_PRIORITY); 
t1.setPriority(Thread.MIN_PRIORITY);
System.out.println("the priority of thread1:"+t.getPriority()); 
System.out.println("the priority of thread2:"+t1.getPriority());  
t.start();
t1.start();
t2.start();
t3.start();
}
}


