import java.util.Scanner;

public class Demo extends Thread
{
	
	
  public void run()
  {
	  try
	  {
		    Scanner reader = new Scanner(System.in); 
		    System.out.println("Enter userName is:: ");
		    System.out.println("Enter password is::");
		    long limit = 5000L;
		    long startTime = System.currentTimeMillis();
		    String uname = reader.next();
		    if ((startTime + limit) < System.currentTimeMillis())
		        System.out.println("Sorry, your answer is too late");
		    else if(uname.equals("admin"))
		        System.out.println("LoginSucess!!");
	  
	  }
	  catch(Exception r)
	  {
		  System.out.println(r);
	  }
  }
  

	public static void main(String[] args) 
	{
		Demo t1=new Demo();
		t1.start();
		
	}

}
