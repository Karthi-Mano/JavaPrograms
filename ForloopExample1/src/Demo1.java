import java.util.Scanner;

public class Demo1 
{
  int i,n;
  Scanner h=new Scanner(System.in);
  void h1()
  {
	  System.out.println("Enter the n value is:\n");
	  n=h.nextInt();
	  for(i=0;i<=n;i++)
	  {
		  System.out.println("I value is:\n"+i);
	  }
  }
}
class Sample
{
	public static void main(String[] args)
	{
		Demo1 k=new Demo1();
		k.h1();

	}

}
