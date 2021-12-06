package data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import menu.ProductPanel;
import user.Product;
import user.UserDAO;

public class Data {
	public static final String type[] = {"시트","생크림","속 재료", "겉 토핑","단","추가"};
	public static final String type_db[] = {"sheets","Cream","Ingre", "Topping","Floor","Addp"};
	public static final String menu[][]= {
			{"바닐라 시트","초코 시트","핑크 시트","레드벨벳 시트","녹차 시트","커피 시트"},
			{"생크림 ","초코맛 생크림","딸기맛 생크림 ","고구마맛 크림","녹차맛 크림","커피맛 크림"},
			{"크림 치즈","블루베리 무스","후르츠 칵테일","망고","견과류","딸기"},
			{"체리","초콜릿","포도","키위","견과류","오렌지"},
			{"1단","2단","3단"},
			{"생일 꼬깔모자","초코펜","폭죽","생일 초"}
	};
	public static final String Filename[][]= {
			{"sheet_banila.jpg","sheet_choco.jpg","sheet_pink.jpg","sheet_redvelvet.jpg","sheet_greentea.jpg","sheet_coffee.jpg"},
			{"cream_.jpg ","cream_choco.jpg","cream_strawberry.jpg ","cream_sweetpotato.jpg","cream_greentea.jpg","cream_mocha.jpg"},
			{"in_Creamcheese.jpg","in_blueberrymousse.jpg","in_Fruitscocktail.jpg","in_Mango.jpg","in_nuts.jpg","in_Strawberry.jpg"},
			{"top_cherry.jpg","top_Chocolate.jpg","top_Grape.jpg","top_Kiwi.jpg","top_nuts.jpg","top_Orange.jpg"},
			{"1layer.jpg","2layer.jpg","3layer.jpg"},
			{"add_conehat.jpg","add_Chocolatepen.jpg","add_Firecracker.jpg","add_Birthdaycandles.jpg"}
	};
	public static final int price[][]= {
			{100,200,300,400,500,600},
			{100,300,200,500,300,400},
			{300,200,400,400,300,200},
			{200,400,200,300,300,200},
			{2000,4000,6000},
			{600,500,600,300}
	};
	//public static final int price[] = {100,200,300,400,500,600};

	int count=0;
	public Statement stmt;
	public String sql;
	String category;
	/*
	 * public HashMap<Integer, ArrayList<Product>> getProductsByType() {
	 * HashMap<Integer, ArrayList<Product>> prMap = new HashMap<>();
	 * 
	 * if (UserDAO.conn != null) { try { for (int i = 0; i < Product.type.length;
	 * i++) { System.out.println(i); ArrayList<Product> tempList = new
	 * ArrayList<>(); String category = Product.type[i]; String sql =
	 * "select * from "+category; ResultSet rs = stmt.executeQuery(sql);
	 * 
	 * 
	 * while (rs.next()) {
	 * 
	 * String name = rs.getString("name"); String imagePath =
	 * rs.getString("fileSrc"); int price = rs.getInt("price");
	 * 
	 * Product pr = new Product(name,price, imagePath,category); tempList.add(pr); }
	 * System.out.println("tmpe: "+tempList); prMap.put(i, tempList); } } catch
	 * (SQLException e) { e.printStackTrace(); } } return prMap; }
	 * 
	 * 
	 */
}
