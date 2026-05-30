import java.util.*;
class Nthread extends Thread{
public void run(){
for(int i=1;i<=5;i++){
System.out.println("The first thread:"+(-1*i));
}
}}
class ThreadA extends Thread{
public void run(){
for(int i=1;i<=5;i++){
System.out.println("The second thread:"+(2*i));
}
}}
class ThreadB extends Thread{
public void run(){
for(int i=1;i<=5;i++){
System.out.println("The Third thread:"+(5*i));
}
}}
public class Mainthread{
public static void main(String args[]){
Nthread t = new Nthread();
ThreadA t1=new ThreadA();
ThreadB t2 = new ThreadB();
t.start();
t1.start();
t2.start();
System.out.println("multi threading finish:");
}
}
