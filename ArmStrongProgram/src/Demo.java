import java.util.Scanner;

public class Demo 
{

	int rem=0,n,s,temp;
	Scanner scan=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		n=scan.nextInt();
	}
	void cal()
	{
		temp=n;
		while(n>0)
		  {
		    rem=n%10;
		    s=s+rem*rem*rem;
		    n=n/10;
		    }
		if(s==temp)
		{
			System.out.println("ArmStrong");
		}
		else
		{
			System.out.println("Not a ArmStrong");
		}
	}
	public static void main(String[] args) 
	{
		Demo g=new Demo();
		g.get1();
		g.cal();

	}

}
