
public class Demo 
{
	 static int pid=100;

	Demo()//default Cons..
	{
		pid++;
		System.out.println("Default cons..."+pid);
	}
	Demo(int a)//param cons..
	{
		System.out.println("param cons"+a);
		
	}
	 
	public static void main(String[] args) 
	{
		new Demo();
		new Demo();
		new Demo(100);

	}

}
