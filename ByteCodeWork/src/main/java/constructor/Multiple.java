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
		m.display1();
		m.display2();

	}

}
