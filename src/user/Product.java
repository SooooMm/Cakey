package user;

import java.util.Locale.Category;

public class Product {
	private int price;
	private String name;
	private String fileSrc;
	private String category;
	
	public static final String type[] = {"시트","생크림","속 재료", "겉 토핑","단","추가"};
	public static final String type_db[] = {"sheets","Cream","Ingre", "Topping","Floor","Addp"};
	
	public Product() {
		
	}
	public Product(String name,int price,String fileSrc,String Category) {
		this.name=name;
		this.fileSrc=fileSrc;
		this.price=price;
		this.category=category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFileSrc() {
		return fileSrc;
	}
	public void setFileSrc(String fileSrc) {
		this.fileSrc = fileSrc;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public static String[] getType() {
		return type;
	}
	public static String[] getTypeDb() {
		return type_db;
	}	
	
}
