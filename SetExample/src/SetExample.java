import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetExample 
{
	
	// Scanner h=new Scanner(System.in);
	 void process()
	 {
		HashSet<String> g=new HashSet<>();
		g.add("a1");
		g.add("b1");
		g.add("c1");
		g.add("c1");
		
		Iterator<String> j1=g.iterator();
		
		while(j1.hasNext())
		{
			System.out.println("Result is"+j1.next());
		}
		
		System.out.println("Result is"+g.size());
		System.out.println("Result is"+g.getClass());
		System.out.println("Contains"+g.contains("a1"));
	 }
}
class Demo
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SetExample j=new SetExample();
		j.process();

	}

}
