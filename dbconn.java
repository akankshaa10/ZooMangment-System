package zoo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Zooconnectdatabase {

	public static void main(String[] args)
	{
		try
		{
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Succesfully...");
		Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo","root","");
		 System.out.println("Conncetion got Succesfully");
		
	    }
		catch(Exception e)
		{
		e.printStackTrace();
		
	}
	}
}
