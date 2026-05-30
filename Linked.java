import java.util.*;
public class Linked{
public static void main(String args[]){
LinkedList<String> l = new LinkedList<String>();
l.add("siva");
l.add("iva");
l.add("sivam");
System.out.println("strings:"+l);
l.set(1,"sita");
System.out.println("updated:"+l);
l.remove("siva");
System.out.println("After removal:"+l);
}
}

