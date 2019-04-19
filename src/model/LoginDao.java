package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao extends BasicDao {

	public boolean Checker(String username, String userpasswd) throws SQLException, ClassNotFoundException {
		String sql = "Select * from yasui_user where name = ? AND passwd = ? ";
		try (Connection conn = this.connect();PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, username);
			pstmt.setString(2, userpasswd);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				String passwd = rs.getString("passwd");
				System.out.println(name);
				System.out.println(passwd);
				//				//デバッグ用
				//				if (name.equals(username))
				//					;
				//				if (passwd.equals(userpasswd))
				//					;
				if (name.equals(username) && passwd.equals(userpasswd)) {
					return true;
				}
			}
			return false;
		} catch (SQLException e) {
			System.out.println("FALLS");
			return false;
		}
	}

}
