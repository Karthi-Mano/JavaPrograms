import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class DemoApp 
{
	
	
  void input()
  {
	/*HashSet<String>list=new HashSet<>();*/
	  
	  ArrayList<String>list=new ArrayList<>();
	  
	list.add("s1");
	list.add("s2");
	list.add("s3");
	list.add("s3");
	Iterator j=list.iterator();
	
	while(j.hasNext())
	{
		System.out.println("Your Data is:::"+j.next());
	}
	
	
	System.out.println("Before remove Size is::\n"+list.size());
	System.out.println("Data is::\n"+list);
	System.out.println("After Remove size is::\n"+list.remove("s1"));
	System.out.println("After remove Size is::\n"+list.size());
	System.out.println("Searching data is::\n"+list.contains("s1"));
	
  }
	
}
class App
{
	public static void main(String[] args)
	{
		DemoApp j=new DemoApp();
		j.input();

	}

}
