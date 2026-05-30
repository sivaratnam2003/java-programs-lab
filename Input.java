import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Input{
public static void main(String args[]) throws IOException{
Long phno;
char data;
float avg;
double num;
long lg;
boolean x;
BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Reading integer data");
phno = Long.parseLong(b.readLine());
System.out.println("Enter character data");
data=(char)b.read();
Float.parseFloat("");
System.out.println("Reading float data");
avg=Float.parseFloat(b.readLine());
System.out.println("Reading double data");
num = Double.parseDouble(b.readLine());
System.out.println("Reading long data");
lg = Long.parseLong(b.readLine());
System.out.println("Reading Boolean data");
x=Boolean.parseBoolean(b.readLine());
System.out.println("phone number:"+phno);
System.out.println("character:"+data);
System.out.println("float data:"+avg);
System.out.println("double data:"+num);
System.out.println("long data:"+lg);
System.out.println("boolean data:"+x);
}
}




