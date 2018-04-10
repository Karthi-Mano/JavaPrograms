
public class Demo extends Thread
{
	
 public void run()
 {
	
	try
	{
    System.out.println("in"); 
	Thread.sleep(2000);
	System.out.println("Current Thread name is:"+currentThread().getName());
	System.out.println(" Thread Priority is:"+currentThread().getPriority());
	}
	catch(InterruptedException r)
	{
		System.out.println(r);
	}
 }

	
}
class Foo
{
	public static void main(String[] args) 
	{
		Demo t1=new Demo();
		Demo t2=new Demo();
		t1.setName("niit");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t2.setPriority(Thread.NORM_PRIORITY);

	}

}
