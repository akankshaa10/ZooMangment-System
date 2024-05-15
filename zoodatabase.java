package zoo;

import java.sql.Connection;
import java.sql.DriverManager;

import hotelmanagement.database;

public class Zoodatabase {
public Connection con;
	
	public Zoodatabase()
	{
		try
		{
			
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Driver Loaded Succesfully...");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo","root","");
System.out.println("Conncetion got Succesfully");

}
catch(Exception e)
{
e.printStackTrace();



}

}

public static void main(String[] args) {
Zoodatabase d=new Zoodatabase();
}

}
