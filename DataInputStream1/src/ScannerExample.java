import java.util.Scanner;

public class ScannerExample 
{
  String uname;
  int pid;
  float f1;

  Scanner g1=new Scanner(System.in);
  void input()
  {
	  System.out.println("Enter the value is:\n");
	  uname=g1.next();
	  pid=g1.nextInt();
	  f1=g1.nextFloat();
	  
  }
  void dis()
  {
	  System.out.println("Result is:\n"+uname+""+pid+""+f1);
  }
}
class Demo3
{
	public static void main(String as[])
	{
		ScannerExample g=new ScannerExample();
		g.input();
		g.dis();
	}
}
