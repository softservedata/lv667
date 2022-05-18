package com.softserve.edu22db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 	  CREATE USER 'lv667'@'localhost' IDENTIFIED BY 'Pmp-31-32uni';
 *    GRANT ALL ON *.* TO 'lv667'@'localhost';
 *
 *    CREATE USER 'lv667'@'%' IDENTIFIED BY 'Pmp-31-32uni';
 *    GRANT ALL ON *.* TO 'lv667'@'%';
 */
public class ApplDB {
	private static Connection con = null;
	private static String username = "lv667";
	private static String password = "Pmp-31-32uni";
	//private static String URL = "jdbc:mysql://192.168.198.128:3306/";
	private static String URL = "jdbc:mysql://192.168.198.128:3306/lv667";
	//
	////private static String username = "postgres";
	////private static String password = "root";
	//private static String URL = "jdbc:postgresql://localhost:5432/";
	////private static String URL = "jdbc:postgresql://localhost:5432/lv667";
	//private static String URL = "jdbc:postgresql://localhost:5432/";

	public static void main(String[] args) throws SQLException {
		System.out.println("Start...");
		//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		con = DriverManager.getConnection(URL, username, password);
		if (con != null) {
			System.out.println("Connection Successful! \n");
		} else {
			System.out.println("Connection ERROR \n");
			System.exit(1);
		}
		Statement st = con.createStatement();
		/*-
		//st.execute("CREATE DATABASE lv667;");
		// MySQL
		String query = "CREATE TABLE temp "
			+ "( id int unsigned not null auto_increment primary key, "
			+ "name varchar(20), "
			+ "login varchar(20), "
			+ "password varchar(30), "
			+ "age int );";
		// PostGreSQL
//		String query = "CREATE TABLE temp "
//			+ "( id int not null primary key, "
//			+ "name varchar(20), "
//			+ "login varchar(20), "
//			+ "password varchar(30), "
//			+ "age int );";
		st.execute(query);
		*/
		/*
		// MySQL
		// String query = "INSERT INTO temp (name,login,password,age) VALUES ('Ivan','iva','qwerty',21);";
		String query = "INSERT INTO temp (name,login,password,age) VALUES ('Petro','pet','123456',22);";
		//
		// PostGreSQL
		//String query = "INSERT INTO temp (id,name,login,password,age) VALUES (2,'Ivan','iva','qwerty',21);";
		//String query = "INSERT INTO temp (id,name,login,password,age) VALUES (1,'Petro','pet','123456',22);";
		//
		st.execute(query);
		*/
		//st.execute("INSERT INTO temp (id,name,login,password,age) VALUES (42,'Ira','ira','asdfgh',23);");
		//st.execute("INSERT INTO temp (name,login,password,age) VALUES ('Ira','ira','asdfgh',23);");
		//st.executeUpdate("UPDATE temp SET name='Tolik' WHERE login LIKE 'p%';");
		//st.executeUpdate("UPDATE temp SET name='Petro' WHERE id=1;");
		//st.execute("DELETE FROM temp WHERE name='Tolik';");
		//st.execute("DELETE FROM temp WHERE name='Ira';");
		// /*-
		//st.execute("USE lv667;");
		ResultSet rs = st.executeQuery("select * from temp;");
		//ResultSet rs = st.executeQuery("select * from users;");
		int columnCount = rs.getMetaData().getColumnCount();
		// Resultset.getMetaData () get the information
		for (int i = 1; i <= columnCount; i++) {
			System.out.print(rs.getMetaData().getColumnName(i) + "\t");
		    //System.out.print(rs.getMetaData().getColumnLabel(i) + "\t");
		}
		System.out.println();
		// output file
		while (rs.next()) {
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(rs.getString(i) + "\t");
			}
			System.out.println();
		}
		System.out.println("before close");
		if (rs != null) {
			rs.close();
		}
		// */
		if (st != null) {
			st.close();
		}
		if (con != null) {
			con.close();
		}
		System.out.println("DONE");
	}
}
