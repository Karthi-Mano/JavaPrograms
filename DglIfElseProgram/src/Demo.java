import java.util.Scanner;

public class Demo 
{

	int p,c;
	Scanner s1=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is:\n");
		p=s1.nextInt();
	}
	void get2()
	{
		int f=0;
		//int f1=1;
		if(p%2==f)
		{
			
			System.out.println("Even"+p+"Rem.."+f);
		}
		else
		{
			System.out.println("Odd"+p);
		}
	}
	
	public static void main(String[] args) 
	{
	Demo h=new Demo();
	h.get1();
	h.get2();

	}

}
