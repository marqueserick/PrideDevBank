package factory;

import java.sql.*;

public class ConnectionFactory {
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://pridedevdatabase.c3lbe0bvk2jp.us-east-1.rds.amazonaws.com/erickmarques?useSSL=false",
		"erickmarques", "erickmarques");
	}

}
