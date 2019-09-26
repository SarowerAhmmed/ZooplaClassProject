package com.db.util.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBData {

	public static void main(String[] args) throws Throwable {

		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522/orcl", "hr", "sarower");
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet	rs = stmt.executeQuery("select URL from GCRSHOPE");
	

		List<String> columnValue = new ArrayList<String>();

		try {
			while (rs.next()) {
				System.out.println(rs.getInt(0));
				columnValue.add(rs.getString("URL"));

			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		// System.out.println(columnValue);
		// step5 close the connection object
		
		System.out.println(columnValue);
	}

}
