import java.util.Scanner;

public class Sample1 
{
  String name;
  Scanner h=new Scanner(System.in);
  void j1()
  {
	  System.out.println("Enter the value is:\n");
	  name=h.next();
	  switch(name)
	  {
	  case "niitkarur":
		  System.out.println("U enter in niitkarur");
		  break;
	  case "niitdgl":
		  System.out.println("U enter in niitdgl");
		  break;
		  default:
			  System.out.println("Enter the correct option");
			  break;
	  }
  }
}
class Demo
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 j=new Sample1();
		j.j1();

	}

}
