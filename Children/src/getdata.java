import java.sql.*;
public class getdata {
	public static void variety()throws Exception{
		String url="jdbc:mysql://localhost:3306/luckie";
		String username="root";
		String password="2901";
		String query="select*from pet";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement pst=con.createStatement();
		ResultSet rs=pst.executeQuery(query);
		while(rs.next()) {
			System.out.println("id"+rs.getInt(1));
			System.out.println("name"+rs.getString(2));
			System.out.println("email"+rs.getString(3));
		}
		con.close();
	}
	public static void main(String[]args)throws Exception{
		variety();
	}

}
