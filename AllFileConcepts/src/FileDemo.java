import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Scanner;

public class FileDemo 
{
	
 String uname;
 Scanner k=new Scanner(System.in);
  void fileWrite() throws IOException
  {
	  try
	  {
	    FileOutputStream g=new FileOutputStream("D:\\f1.txt");
	    System.out.println("Enter the value is:\n");
	    uname=k.next();
	    byte s[]=uname.getBytes();
	    g.write(s);
	    System.out.println("File Ins...");
	    
	  }
	  catch(FileNotFoundException t)
	  {
		  System.out.println(t);
	  }
  }
  void fileRead() throws IOException
  {
	  int i;
	  try
	  {
		  FileInputStream g2=new FileInputStream("D:\\f1.txt");
		  FileOutputStream g4=new FileOutputStream("D:\\f4.txt");
		  FileInputStream g3=new FileInputStream("D:\\f3.txt");
		  SequenceInputStream sis=new SequenceInputStream(g2, g3);
		  
		  while((i=sis.read())!=-1)
		  {
			// System.out.print((char)i);
			  g4.write((byte)i);
		  }
		  
		  
	  }
	  catch(FileNotFoundException y)
	  {
		  System.out.println(y);
	  }
  }
  
}
class Demo
{
	public static void main(String[] args) throws IOException 
	{
		FileDemo m=new FileDemo();
		//m.fileWrite();
		m.fileRead();

	}

}
