package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemDao extends BasicDao {
	public ArrayList<ItemVo> selectAllItem() throws SQLException, ClassNotFoundException {
		ArrayList<ItemVo> itemList = new ArrayList<ItemVo>();

		String sql = "Select * from item where is_delete = 0 ";

		try (Connection conn = super.connect()){
		try (PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();) {
			while (rs.next()) {
				int itemId = rs.getInt("item_id");
				String itemname = rs.getString("item_name");
				String imgurl = rs.getString("imgurl");
				String itemsize = rs.getString("item_size");
				int price = rs.getInt("price");
				int flug = rs.getInt("is_delete");
				itemList.add(new ItemVo(itemId, itemname, imgurl, itemsize, price, flug));
			}
		}
		}
		return itemList;
	}
}