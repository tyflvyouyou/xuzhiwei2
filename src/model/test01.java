package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class test01 {
	String username = "";
	String userpasswd = "";

	public static void main(String[] args) {
		//LoginDao logindao = new LoginDao();
		ItemDao itemdao = new ItemDao();
		ArrayList<ItemVo> itemList = null;
		try (Connection conn = itemdao.connect()) {
			itemList = itemdao.selectAllItem(conn);

			System.out.println("END");

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
