import java.io.IOException;
import java.util.Scanner;

public class DemoProgram 
{
	int prid[]=new int[3];
	int n,i;
	Scanner g=new Scanner(System.in);
	void g1()
	{
		try
		{
				System.out.println("Enter the value is:\n");
		n=g.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the Product details..\n");
			prid[i]=g.nextInt();
			System.out.println("Your Product details...\n"+prid[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException t)
		{
			System.out.println("Please enter correct size"+t);
		}
		
		
		
		
	}
}
class Demo
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DemoProgram h=new DemoProgram();
		h.g1();

	}

}
