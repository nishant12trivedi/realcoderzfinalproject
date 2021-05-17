
package com.solution.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/solution", "root", "mysql");
			if(con!=null)
				System.out.println("Connected");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
}