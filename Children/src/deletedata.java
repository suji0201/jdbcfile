import java.sql.*;
public class deletedata {
	public static void variety()throws Exception{
		String url="jdbc:mysql://localhost:3306/luckie";
		String username="root";
		String password="2901";
		String query="delete from pet where id=1 ";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(query);
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[]args)throws Exception{
		variety();
	}

}
