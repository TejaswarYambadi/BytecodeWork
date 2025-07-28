package constructor;

public class Multiple {
	int i,j;
	Multiple(){
		i=100;
	}
	Multiple(int i){
		this.i =i;
	}
	Multiple(int i,int j){
		this.i=i;
		this.j=j;
	}
	public int display1() {
		return i;
	}
	public int display2() {
		return j;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple m = new Multiple();
		System.out.println(m.display1());
		System.out.println(m.display2());
		Multiple m1 = new Multiple(10);
		System.out.println(m1.display1());
		System.out.println(m1.display2());
		Multiple m2 = new Multiple(10,20);
		System.out.println(m2.display1());
		System.out.println(m2.display2());
	}

}
