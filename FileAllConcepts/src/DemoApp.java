import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Scanner;

public class DemoApp 
{

  String uname;
  Scanner g=new Scanner(System.in);
  void getWrite()
  {
	  try
	  {
      		  
	 /* FileOutputStream fout=new FileOutputStream("F:\\s1.txt");
	  System.out.println("Enter the name is:\n");
	  uname=g.next();
	  
	  byte d[]=uname.getBytes();
	  
	  fout.write(d);
	  System.out.println("File Inserted sucss");*/
	  FileInputStream fis=new FileInputStream("F:\\s1.txt");
	  FileInputStream fis1=new FileInputStream("F:\\s2.txt");
	  SequenceInputStream sis=new SequenceInputStream(fis,fis1);
	  FileOutputStream fout2=new FileOutputStream("F:\\s3.txt");
	 // FileOutputStream fout1=new FileOutputStream("F:\\s2.txt");
	  int i;
	  
	  while((i=sis.read())!=-1)
	  {
		//System.out.print((char)i);  
		 // fout1.write((byte)i);
		  fout2.write((byte)i);
	  }
		  
		  
	  }
	  catch(Exception t)
	  {
		  
	  }
  }
}
class Foo
{
	
	public static void main(String[] args)
	{
		DemoApp g=new DemoApp();
		g.getWrite();

	}

}