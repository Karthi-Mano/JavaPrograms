
public class Demo
{
	void p1(String uname)
	{
		System.out.println("welcome-1"+uname);
		
	}
	void p2(int pid)
	{
		System.out.println("welcome-2"+pid);
	}
}
class Foo
{
	public static void main(String[] args) 
	{
		
      Demo g1=new Demo();
      g1.p1("mohan");
      g1.p2(101);
	}

}
