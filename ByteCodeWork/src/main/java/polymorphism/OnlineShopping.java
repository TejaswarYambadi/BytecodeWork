package polymorphism;
class Product{
	String name;
	float price;
	Product(String name ,float price){
		this.name=name;
		this.price=price;
	}
	void Display() {
		System.out.println("Product Name = "+name);
		System.out.println("Product price = "+price);
	}
	void Discount() {
		System.out.println("No discount available for this product");
	}
}
class Electronics extends Product{
	Electronics(String name, float price) {
		super(name, price);
	}
	
	void Discount() {
		float a=price*0.1f;
		System.out.println(name + " Discount= "+a);
	}
}
class Clothing extends Product{
	Clothing(String name, float price) {
		super(name, price);
	}
	
	void Discount() {
		float a=price*0.3f;
		System.out.println(name + " Discount= "+a);
	}
}
class Books extends Product{
	Books(String name, float price) {
		super(name, price);
	}
	
	void Discount() {
		float a=price*0.5f;
		System.out.println(name + " Discount= "+a);
	}
}
public class OnlineShopping {
	public static void main(String[]args) {
		Product [] p = {
				new Electronics("Phone", 50000),
				new Clothing("Shirt", 1500),
				new Books("Bytecode", 1000)
				
		};
		for(Product pr:p) {
			pr.Display();
			pr.Discount();
		}
	}
}
