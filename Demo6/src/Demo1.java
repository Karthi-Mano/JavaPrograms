import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Demo2 {
	String name[]=new String[30];	
	static int j=0;
	static int i=0;
	static int count=1;
	Scanner Scan=new Scanner(System.in);
	HashSet<String> Name =new HashSet<>();
	
	void getdata()
	{
		System.out.println("Enter number of users to add: ");
		int n=Scan.nextInt();
		count=1;		
		for(int i=0;i<n;i++)
		{
		
			System.out.println("Enter the name of the user "+count);
			name[j]=Scan.next();
			Name.add(name[j]);
			System.out.println("UserId:"+j);
			j++;
			count++;							
		}
		System.out.println("----------------------------------------------------------------");
		System.out.println("User Added Successfully");
		System.out.println();		
		System.out.println("TOTAL NUMBER OF USERS "+Name.size());
		System.out.println("----------------------------------------------------------------");
		System.out.println("Press 1 to View Userlist");
		System.out.println("Press 2 to go to Main menu");
		int s2=Scan.nextInt();
		switch(s2)
		{
		case 1:
			Display();
			break;
		case 2:
			Switch();
			break;
		}				
	}
	
	public void Display()
	{
		Iterator<String>I=Name.iterator();
		
		while(I.hasNext())
		{
			
			System.out.println("Username: "+I.next()+"\n");
		
		}
		if(Name.size()==0)
		{
			System.out.println("User database is empty.......\n");
			
			System.out.println("Press 1 to Add more Users");
			System.out.println("Press 2 to Return main menu");
			int s3=Scan.nextInt();
			switch(s3)
			{
			case 1:
				getdata();
				break;
			case 2:
				Switch();
				break;
			}
		}
		if(Name.size()!=0)
		{
		System.out.println("Total Number of users "+Name.size());
		System.out.println("Press 1 to Add more Users");
		System.out.println("Press 2 to Return main menu");
		int s3=Scan.nextInt();
		switch(s3)
		{
		case 1:
			getdata();
			break;
		case 2:
			Switch();
			break;
		}
		}
	}
	
	void remove_User()
	{
		int index;
		System.out.println("Enter a Userid to delete a user:");
		index=Scan.nextInt();
		Name.remove(name[index]);
		System.out.println("Total number of users "+Name.size());
	}
	
	
	void Switch()
	{
		System.out.println("             SELECT A CATAGRY          ");
		System.out.println("1.Register a user");
		System.out.println("2.Display all users");
		System.out.println("3.Delete User");
		System.out.println("4.Search user ");
		int s=Scan.nextInt();
		switch(s)
		{
		case 1:
			getdata();
			break;
		case 2:
			Display();
			break;
		case 3:
			remove_User();
			break;
		case 4:
			search();
			break;
        default:
        	Switch();
		}
	}
	void search()
	{
		if(Name.size()==0)
		{
			System.out.println("User database is empty.......\n");
			
			System.out.println("Press 1 to Add more Users");
			System.out.println("Press 2 to Return main menu");
			int s3=Scan.nextInt();
			switch(s3)
			{
			case 1:
				getdata();
				break;
			case 2:
				Switch();
				break;
			}
		}
		else{
		
		System.out.println("Enter Username to Search");
		String temp=Scan.next();
		
			if(Name.contains(temp))
			{
				System.out.println("Username Available!!!!!!!");
				for(int i=0;i<j;i++)
				{
				if(temp.equals(name[i]))
				{
					System.out.println("Id of a Username is  "+i);
				}
			}			
		}
			else
			{
				System.out.println("User not Found");
			}	
	}
}
}





public class Demo1
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 obj =new Demo2();
		obj.Switch();

	}

}
