import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class UserMasterDao {
	    
		
		private String dbUrl = "jdbc:mysql://101.53.155.156:3306/spring_boot_demo";
		private String dbUname = "spring_boot_demo";
		private String dbPassword = "Ebrain@20";
		private String dbDriver = "com.mysql.cj.jdbc.Driver";
		
		public void loadDriver(String dbDriver)
		{
			try {
				Class.forName(dbDriver);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public Connection getConnection()
		{
			Connection con = null;
			try {
				con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
		}
		
		
		public String insert(UserMaster userMaster)
		{
			loadDriver(dbDriver);
			Connection con = getConnection();
			String result = "Data entered successfully";
			String sql = "insert into User_Master values(?,?,?,?,?,?,?,?)";
//			
//			Date joiningDatestr = null;
//			
//				
//			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
//		
//			joiningDatestr=formatter.format(userMaster.getCreatedDate());
			
			PreparedStatement ps;
			
			try {
			ps = con.prepareStatement(sql);
			
			ps.setString(1, userMaster.getUserName());
			ps.setString(2, userMaster.getPassword());
			ps.setString(3, userMaster.getPassword());
			ps.setDate(4,  (java.sql.Date) ( userMaster.getCreatedDate()));
			ps.setDate(5,  (java.sql.Date) userMaster.getModifiedDate());
			ps.setString(6,  userMaster.getLogTag());
			ps.setString(7,  userMaster.getType());
			ps.setString(8,  userMaster.getStatus());
			
			ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				result = "Data not entered";
			}
			return result;
		}

}
