package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class jdbcSavepoint{

	static Connection con;
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/hibernatedb";
		
		Savepoint savepoint = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, "root", "root");
			Statement stmt = con.createStatement();
			// set auto commit to false
			con.setAutoCommit(false);
			// if code reached here, means main work is done successfully
			stmt.executeUpdate("update employee set salary = 10000 where id = 10");
			//setting up a savepoint to ensure things get rolled back till this line and the 
			//queries run before this are committed
			savepoint = con.setSavepoint("EmployeeSavepoint");
			throw new SQLException();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				if (savepoint == null) {
					con.rollback();
					System.out.println("txn rolled back");
				}
				else{
					System.out.println("txn rolled back till commit point");
					con.rollback(savepoint);
					con.commit();
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}

	}

}
