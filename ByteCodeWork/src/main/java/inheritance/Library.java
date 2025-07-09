package inheritance;
class De{
	int rollno;
	String name ;
	void getDetails(int r,String n) {
		rollno=r;
		name=n;
	}
}
class Books extends De{
	String BookName;
	void getBook(String b) {
		BookName=b;
	}
}
public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books b = new Books();
		b.getDetails(1,"s001");
		b.getBook("Bytecode");
		System.out.println("Student Roll No = "+b.rollno);
		System.out.println("Student Name = "+b.name);
		System.out.println("Book Name = "+b.BookName);
	}

}
