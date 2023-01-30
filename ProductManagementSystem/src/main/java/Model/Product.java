package Model;
import java.util.*;


public class Product {
	 int pid;
	 String pname;
	 int pcat;
	 String manufacture_date;
	 int price;
	 String expiry_date;
	 @Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcat=" + pcat + ", manufacture_date=" + manufacture_date
				+ ", price=" + price + ", expiry_date=" + expiry_date + "]";
	}
	public Product(int pid, String pname, int pcat, String manufacture_date, int price, String expiry_date) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcat = pcat;
		this.manufacture_date = manufacture_date;
		this.price = price;
		this.expiry_date = expiry_date;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPcat() {
		return pcat;
	}
	public void setPcat(int pcat) {
		this.pcat = pcat;
	}
	public String getManufacture_date() {
		return manufacture_date;
	}
	public void setManufacture_date(String manufacture_date) {
		this.manufacture_date = manufacture_date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}
	
}
