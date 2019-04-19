package model;

import java.io.Serializable;

public class ItemVo implements Serializable {
	private static final long serialVersionUID = -6153903774358856423L;
	int item_id;
	String item_name;
	String imgurl;
	String item_size;
	int price;
	int is_delete;

	public ItemVo(int item_id, String item_name, String imgurl, String item_size, int price, int is_delete) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.imgurl = imgurl;
		this.item_size=item_size;
		this.price=price;
		this.is_delete=is_delete;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String getItem_size() {
		return item_size;
	}

	public void setItem_size(String item_size) {
		this.item_size = item_size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(int is_delete) {
		this.is_delete = is_delete;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
