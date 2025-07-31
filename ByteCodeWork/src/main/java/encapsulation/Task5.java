package encapsulation;
class Product{
	private String name;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price>0) {
			this.price = price;
		}
		else {
			this.price = 0;	
		}
		
	}
	
	
}
public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.setName("Laptop");
		p.setPrice(-500);
		System.out.println("Product = "+p.getName());
		System.out.println("Price = "+p.getPrice());
	}

}
