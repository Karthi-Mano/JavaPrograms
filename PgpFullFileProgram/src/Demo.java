import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Scanner;

public class Demo 
{
	String uname;
	Scanner g1=new Scanner(System.in);
	void writeProcess() throws IOException,InterruptedException
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("F:\\f1.txt");
			System.out.println("Enter the value is::");
			uname=g1.next();
			
			byte f[]=uname.getBytes();
			
			fout.write(f);
			
			Thread.sleep(2000);
			
			System.out.println("FileInserted Sucess!!!");
			
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	void readData() throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("F:\\f1.txt");
			FileOutputStream fos=new FileOutputStream("F:\\f2.txt");
			
			int i;
			
			while((i=fis.read())!=-1)
			{
				//System.out.print((char)i);
				fos.write((byte)i);
			}
			
			System.out.println("FileCopyyy...");
			
		}
		catch(FileNotFoundException t)
		{
			
		}
		
	}
	void display() throws IOException
	{
		try
		{
			FileInputStream t1=new FileInputStream("F:\\f1.txt");
			FileInputStream t2=new FileInputStream("F:\\f2.txt");
			FileOutputStream t3=new FileOutputStream("F:\\f3.txt");
			SequenceInputStream sis=new SequenceInputStream(t1,t2);
			int i;
			while((i=sis.read())!=-1)
			{
				//System.out.print((char)i);
				t3.write((byte)i);
			}
			
			System.out.println("FileCopyyy...");
			
		}
		catch(FileNotFoundException t)
		{
			
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException
	{
		Demo j1=new Demo();
		//j1.writeProcess();
		//j1.readData();
		j1.display();

	}

}
