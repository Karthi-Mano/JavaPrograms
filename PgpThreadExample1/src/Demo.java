
public class Demo  extends Thread
{

	
	public void run()
	{
		try
		{
			System.out.println("&");
			System.out.println("CurrentThreadName is:::"+currentThread().getName());
			System.out.println("PriorityName is:::"+currentThread().getPriority());
			System.out.println("&&");
		}
		catch(Exception t)
		{
			
			
		}
	}
	
	synchronized void get() throws InterruptedException
	{
		System.out.println("waitIN");
		wait(9000);
		notify();
		System.out.println("waitOut");
		
		
	}
	synchronized void get1()
	{

	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		Demo t1=new Demo();
		Demo t2=new Demo();
		Demo t3=new Demo();
		System.out.println("*");
		
		t2.start();
		System.out.println("**");
		
		/*try
		{
			System.out.println("JoinIN");
			t2.join();
			System.out.println("JoinOUT");
		}
		catch(Exception t)
		{
			
		}*/
		t1.start();
		t1.setName("Ashok");
		t2.setPriority(MAX_PRIORITY);
		t1.get();
		//t3.get1();

	}

}
