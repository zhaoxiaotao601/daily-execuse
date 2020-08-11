import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class test {
	public int insertInfo() throws ClassNotFoundException, SQLException{

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Duser?useSSL=false", "root", "123456");
		
		String sql ="insert into t_user values(?,?,?)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, 9);
		ps.setString(2, "zxt");
		ps.setInt(3, 666);
		
		int i = ps.executeUpdate(sql);

		ps.close();
		conn.close();
		return i;
		}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		test test = new test();

		try {
			int i=test.insertInfo();
			if(i>0){
				System.out.println("插入成功");
			}else{
				System.out.println("插入失败");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
