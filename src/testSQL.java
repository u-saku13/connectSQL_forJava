import java.io.*;
import java.sql.*;
public class testSQL{
	static String  driverName = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost/databasename?characterEncoding=utf8";
    static String user = "root";
    static String pass = "";
	public static Connection conDB(){
        Connection con = null;
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url,user,pass);
            System.out.println("ok");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return con;

	}


}
