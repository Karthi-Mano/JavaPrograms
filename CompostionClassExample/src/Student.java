
public class Student 
{
String sname;
int sid;
  Student(String sname,int sid)
  {
	  this.sname=sname;
   	  this.sid=sid;
   	  System.out.println(""+sname+""+sid);
  }
  void display()
  {
	  System.out.println("Result is:\n"+sname+""+sid);
  }
  public static void main(String as[])
  {
	  Student g=new Student("azar",101);
	  g.display();
  }
}
