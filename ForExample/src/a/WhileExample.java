package a;

import java.util.Scanner;

public class WhileExample 
{
   int n,s,rem,temp;
   Scanner g=new Scanner(System.in);
   void h1()
   {
	   System.out.println("Enter the n value is:\n");
	   n=g.nextInt();
	   temp=n;
	   while(n!=0)
	   {
		   rem=n%10;
		   s=s+rem*rem*rem;
		   n=n/10;
	   }
	   if(temp==s)
	   {
		   System.out.println("ArmStrong");
	   }
	   else
	   {
		   System.out.println("Not a Arm");
	   }
   }
	
	public static void main(String[] args) 
	{
		WhileExample g=new WhileExample();
		g.h1();

	}

}
