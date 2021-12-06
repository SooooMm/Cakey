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
	public static final String type[] = {"��Ʈ","��ũ��","�� ���", "�� ����","��","�߰�"};
	public static final String type_db[] = {"sheets","Cream","Ingre", "Topping","Floor","Addp"};
	public static final String menu[]= {"�ٴҶ� ��Ʈ","���� ��Ʈ","��ũ ��Ʈ","���座�� ��Ʈ","���� ��Ʈ","Ŀ�� ��Ʈ"};
	public static final int price[] = {100,200,300,400,500,600};

	int count=0;
	public Statement stmt;
	public String sql;
	String category;
	
	public HashMap<Integer, ArrayList<Product>> getProductsByType()
	{
		HashMap<Integer, ArrayList<Product>> prMap = new HashMap<>();

		if (UserDAO.conn != null)
		{	
			try
			{
				for (int i = 0; i < Product.type.length; i++)
				{
					System.out.println(i);
					ArrayList<Product> tempList = new ArrayList<>();
					String category = Product.type[i];
					String sql = "select * from "+category;
					ResultSet rs = stmt.executeQuery(sql);
					
					
					while (rs.next())
					{
						
						String name = rs.getString("name");
						String imagePath = rs.getString("fileSrc");
						int price = rs.getInt("price");
						
						Product pr = new Product(name,price, imagePath,category);
						tempList.add(pr);
					}
					System.out.println("tmpe: "+tempList);
					prMap.put(i, tempList);
				}
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		return prMap;
	}
		
		
	
}
