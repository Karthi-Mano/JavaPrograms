import java.util.Scanner;

public class Demo 
{
	String name;
	int a1;
	float f1;

	Scanner g=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		name=g.next();
		a1=g.nextInt();
		f1=g.nextFloat();
		
		
	}
	void get2()
	{
		System.out.println("Your value is::"+name);
		System.out.println("Your Integer value is:"+a1);
		System.out.println("Your Float value is:"+f1);
	}
	public static void main(String[] args) 
	{
		Demo g=new Demo();
		g.get1();
		g.get2();
	}

}