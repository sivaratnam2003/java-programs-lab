import java.io.*;
class Buffered{
public static void main(String args[]) throws IOException{
InputStreamReader ir = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(ir);
System.out.println("Integer:");
int a = Integer.parseInt(br.readLine());
System.out.println("String:");
String s = br.readLine();
System.out.println("character:");
char d =(char)br.read();
br.readLine();
System.out.println("Float:");
float f=Float.parseFloat(br.readLine());
System.out.println("Double:");
double dr = Double.parseDouble(br.readLine());
System.out.println("long value:");
long l = Long.parseLong(br.readLine());
System.out.println("boolean value:");
boolean x = Boolean.parseBoolean(br.readLine());
System.out.println("Integer:"+a);
System.out.println("String:"+s);
System.out.println("character:"+d);
System.out.println("Float:"+f);
System.out.println("Double:"+dr);
System.out.println("long value:"+l);
System.out.println("boolean value:"+x);
String name = System.console().readLine();
System.out.println("Console class:"+name);
}
} 