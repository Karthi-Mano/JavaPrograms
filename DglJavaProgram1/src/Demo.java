
public class Demo
{
    int a=100;
	void method1(int s1,String n)
	{
		String name="niit";
		System.out.println("Method-1"+a+"String"+name);
		
		System.out.println("Argumnet"+s1+""+n);
	}
	void method2(float f1)
	{
		System.out.println("Method-2"+a+"***"+f1);
	}
	
}	

class MainClass
{
	public static void main(String[] args)
	{
		
	  Demo g1=new Demo();//To create a object
	  g1.method1(300,"azar");
	  g1.method2(3.5f);

	}

}
