import java.sql.*;
public class JDBC {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from actor");
		while(rs.next()) {
			int id = rs.getInt(1);
			System.out.println(id);
			
		}
		con.close();
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","root");
		/*ResultSet rs1=st.executeQuery("Select * from actor");
		while(rs1.next()) {
			int id = rs.getInt(1);
			System.out.println(id);
			
			
		}*/
	}

}
