import java.io.DataInputStream;
import java.io.IOException;

public class Demo 
{
	int a;
	float f1;
	String name;
	char j;
	DataInputStream h=new DataInputStream(System.in);
	void g1() throws IOException 
	{
		System.out.println("Enter the n value is:\n");
		a=Integer.parseInt(h.readLine());
		f1=Float.parseFloat(h.readLine());
		name=h.readLine();
		j=h.readLine().charAt(0);
	}
	void g2()
	{
		System.out.println("Result is:\n"+a+""+f1+""+name+""+j);
	}
}
class Foo
{
	public static void main(String kk[]) throws IOException 
	{
		
          Demo k=new Demo();
          k.g1();
          k.g2();
	}

}
