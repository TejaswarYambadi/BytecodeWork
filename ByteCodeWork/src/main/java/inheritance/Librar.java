package inheritance;
class Student_Details{
	String name;
	String roll_no;
	String branch;
	Student_Details(String name,String roll_no,String branch){
		this.name= name;
		this.roll_no=roll_no;
		this.branch=branch;
	}
	public void show() {
		System.out.println("Student Name = "+name);
		System.out.println("Student ID = "+roll_no);
		System.out.println("Branch = "+branch);
	}
}
class Book_data extends Student_Details{
	String book_name;
	String book_author;
	Book_data(String name,String roll_no,String branch,String book_name,String book_author){
		super(name,roll_no,branch);
		this.book_name = book_name;
		this.book_author = book_author;
	}
	public void display() {
		show();
		System.out.println("Book Namew = "+book_name);
		System.out.println("Book Author = "+book_author);
	}
}
public class Librar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book_data b=new Book_data("Bob","123","CSE","JAVA","Gosling");
		b.display();
	}

}
