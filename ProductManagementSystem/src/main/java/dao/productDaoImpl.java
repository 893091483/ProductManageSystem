package dao;
import java.sql.Connection;

import JDBC.JdbcUtil;

public class productDaoImpl implements productDao{
	
	
	private static final String INSERT_USERS_SQL ="INSERT INTO prodict"
				+ "(id,name,category,manufacture_date,price,expiry_date) VALUES"
				+ "(?,?,?,?,?,?)";
	@Override
	public void addProduct(int pId, String pName, String pCat, String manufecture_date, String price_expiry_date) {
		// TODO Auto-generated method stub
		
	}
	
	

}
