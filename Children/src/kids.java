import java.sql.*;
public class kids {
	public static void student()throws Exception{
		String url="jdbc:mysql://localhost:3306/flower";
		String username="root";
		String password="2901";
		String query="insert into bloom values(?,?,?)";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1, 3);
		pst.setString(2, "hibiscus");
		pst.setString(3,"red");
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[]args)throws Exception{
		student();
	}

}
