import java.util.*;
class Mythread extends Thread{
public void run(){
for(int i=1;i<=10;i++){
System.out.println("the child thread:"+(5*i));
try{
Thread.sleep(1000);
}
catch(InterruptedException e){
System.out.println(e);
}
}
}
}
public class Maintest{
public static void main(String args[]){
Mythread t = new Mythread();
t.start();
System.out.println("thread is alive:"+t.isAlive());

for(int i=1;i<=10;i++){
System.out.println("the main thread:"+(3*i));
try{
t.join();
}
catch(InterruptedException e){
System.out.println("main thread interruption");
}
}
}
}
