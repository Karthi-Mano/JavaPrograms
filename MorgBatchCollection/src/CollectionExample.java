import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExample 
{
  void g1()
  {
	  ArrayList g=new ArrayList();
	  g.add("a1");
	  g.add("a2");
	  g.add("mohan");
	  g.add("azar");
	  Iterator el=g.iterator();
	  
	  while(el.hasNext())
	  {
		  System.out.println("elements are"+el.next());
	  }
	 /* System.out.println("Display Data:"+g);
	  System.out.println("Display the index:"+g.get(1));
	  System.out.println("Total Size of ArrayList:"+g.size());
	  System.out.println("Remove Elements:"+g.remove(1));
	  System.out.println("After Removing Elements Data:"+g);
	  System.out.println("After Removing Size of ArrayList:"+g.size());
	  System.out.println("Searching Elements:"+g.contains("a2"));*/
	  
  }
}
class DemoMain
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		CollectionExample h=new CollectionExample();
		h.g1();

	}

}
