
public class Demo
{
	 static int a=10;
	
	Demo()
	{
		
		a++;
		System.out.println("Value is:"+a);
	}
	static void get1()
	{
	a++;	
	}
	
}
class Sample
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new Demo();
		new Demo();
	//	Demo h=new Demo();
		
		/*Demo.demo1();
		Demo.demo1();*/
		Demo.get1();
		

	}

}
