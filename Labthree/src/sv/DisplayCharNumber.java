package sv;

import java.io.*;
import java.util.Scanner;

public class DisplayCharNumber {
public static void main(String args[])
{
try
{
int lines=0,chars=0,words=0;
int code=0;
String path ="D:\\vlsi_internal.txt";
FileInputStream fil = new FileInputStream(path);
while(fil.available()!=0)
{
code = fil.read();
if(code!=10)
chars++;
if(code==32)
words++;
if(code==13)
{
lines++;
words++;
}
}
System.out.println("No of characters = "+chars);
System.out.println("No of words = "+(words+1));
System.out.println("No of lines = "+(lines+1));
fil.close();
}
catch(FileNotFoundException e)
{
System.out.println("Cannot find the specified file...");
}
catch(IOException i)
{
System.out.println("Cannot read file...");
}
}
}