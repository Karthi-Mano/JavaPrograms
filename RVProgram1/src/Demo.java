
public class Demo 
{
	//int a=100;//class variable
	void get1(String uname,int a1)
	{
		
		System.out.println("welcome method-1"+uname+""+a1);
	}
	void get2(float f1)
	{
		//float f1=2.4f;//local variable
		System.out.println("welcome method-2"+f1);
	}
	

	public static void main(String[] args)
	{
          
		 Demo g=new Demo();
		 g.get1("azar",12);
		 g.get2(2.4f);

	}

}
