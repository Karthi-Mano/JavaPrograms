import java.util.Scanner;

public class DglSwitchProgram 
{
	
	int s1;
	Scanner g=new Scanner(System.in);
	void input()
	{
		System.out.println("Ente the value is:\n");
		s1=g.nextInt();
		
	}
	void dis()
	{
		switch(s1)
		{
		case 1:
			int a;
			System.out.println("Enter the a value is:\n");
			a=g.nextInt();
			if(a%2==0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
			}
			break;
		case 2:
			System.out.println("case-2");
			break;
		default:
			System.out.println("Default is::");
			break;
		}
	}
 
	public static void main(String[] args) 
	{
		DglSwitchProgram  j=new DglSwitchProgram();
		j.input();
		j.dis();

	}

}
