import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class DbInsertConnection 
{

	public static void main(String[] args) 
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the uname");
			String uname=sc.next();
			System.out.println("Enter the Pass");
			
			String pass=sc.next();
			String str="insert into emp values('"+uname+"','"+pass+"')";
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection conn=DriverManager.getConnection("jdbc:odbc:demo");
			/*PreparedStatement pt=conn.prepareStatement(str);
			pt.setString(1,uname);
			pt.setString(2, pass);
			pt.executeUpdate();*/
			Statement stm=conn.createStatement();
			stm.executeUpdate(str);
		}
		catch(Exception t)
		{
			System.out.println(t);
		}

	}

}
