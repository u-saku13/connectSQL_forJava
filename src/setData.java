import java.sql.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class setData {
	private String selectAll = "SELECT * FROM ";
	public void set() throws SQLException, UnsupportedEncodingException{
		Connection con = testSQL.conDB();
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery(selectAll);
		String stockArray[] = new String[10000];
		StringBuilder tmpstr = new StringBuilder();
		int num = 0;
		while(result.next()){ 
			stockArray[num] = result.getString(3);
			System.out.println(stockArray[num]);
			if(stockArray[num] != null){
				tmpstr.append(stockArray[num]);
				for(int i=0; i<tmpstr.length(); i++){
					tmpstr.insert(2*i, "%");
					System.out.println(tmpstr);
				}

				System.out.println(tmpstr);
			}
			
			
			num++;
		}
	}
}
