import java.io.UnsupportedEncodingException;
import java.sql.*;
public class main {
	public static void main(String[] args) throws SQLException, UnsupportedEncodingException {
		Connection con = testSQL.conDB();
		System.out.println("con=" + con);
		setData dat = new setData();
		dat.set();
		con.close();
	}

}
