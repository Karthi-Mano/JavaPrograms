
public class Demo
{

	Demo()//default cons
	{ 
		
		System.out.println("welcome");
	}
	Demo(int a)//param cons
	{
	
		System.out.println("data is"+a);
	}
	
}
class Sample
{
	public static void main(String[] args) 
	{
           new Demo();//default invoke
         
           new Demo(300);

	}

}
