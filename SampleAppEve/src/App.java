import java.util.Scanner;

public class App 
{
	//int a=100;
	int a;
	float f1;
	String uname;
	Scanner g=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the value is::");
		a=g.nextInt();
		f1=g.nextFloat();
		uname=g.next();
	}
	void output()
	{
		
		System.out.println("Your Integer value  is:"+a);
		System.out.println("Your Float value is is:"+f1+"Your name is"+uname);
	}
  public static void main(String as[])
  {
	  
   App g=new App();
   g.input();
   g.output();
  }
}
