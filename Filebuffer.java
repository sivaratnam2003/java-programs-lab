import java.io.*;
class Filebuffer{
public static void main(String args[]) throws IOException{
File file = new File("sample.txt");
FileWriter fw = new FileWriter(file);
BufferedWriter bw = new BufferedWriter(fw);
bw.write("hello");
bw.newLine();
bw.write("hello java");
bw.newLine();
bw.write("this is buffered file");
bw.close();
FileReader fr = new FileReader(file);
BufferedReader br = new BufferedReader(fr);
String line;
while((line=br.readLine()) != null){
System.out.println(line);}
br.close();
}
}
