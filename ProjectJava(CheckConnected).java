import java.sql.*;

public class ProjectJava
{
	public static void main (String [] args)
	{
		ProjectJava program = new ProjectJava();
		program.connect();
	}
	Connection connection;

	void connect()
	{
		try 
		{
			Class.forName("org.sqlite.JDBC");
			Connection connection = DriverManager.getConnection(
			"jdbc:sqlite:D:\\SQL Lite\\CountryJava.db");
			System.out.println("Connected");
			///////////////////////////////
		}
		catch (Exception e)
		{
			System.out.println (e.getMessage());
		}
	}
}