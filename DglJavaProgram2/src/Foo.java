import java.util.Scanner;

public class Foo 
{

	int a,b,c;
	Scanner g=new Scanner(System.in);//Runtime class
	
	void input()
	{
		System.out.println("Enter the a and b value is:\n");
		a=g.nextInt();
		b=g.nextInt();
		c=a*b;
		System.out.println("YourResult"+c);
	}
}
class Demo
{
	public static void main(String as[])
	{
		Foo h=new Foo();
		h.input();
	}
}
