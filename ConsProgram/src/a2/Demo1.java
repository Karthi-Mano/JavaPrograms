package a2;

import a1.Demo;

public class Demo1 extends Demo
{

	public Demo1()
	{
		 int p1=30;
		 System.out.println("Protected Method::"+p1);
		 System.out.println("ProtectedPackage:::"+p2+"PublicPackage:::"+z);
	}

}

class DemoMain
{
public static void main(String[] args)
{
  //new Demo();
  new Demo1();
  
}
}
