import java.util.Scanner;

class Sample
{
	int a;//classvariable or instance variable
	 String name;
	Scanner g=new Scanner(System.in);
	
  void g1()
  {
	  
	  System.out.println("Enter the value is:\n");
	  name=g.next();
	  a=g.nextInt();
	  System.out.println("variable value is:\n"+name+""+a);
	  
  }
  void g2()
  {
	  System.out.println(""+a+""+name);
  }
}
class Demo
{
	public static void main(String as[]) 
	{
		Sample h=new Sample();
		h.g1();
		h.g2();

	}

}
