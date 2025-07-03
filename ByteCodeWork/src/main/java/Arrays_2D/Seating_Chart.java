
public class Seating_Chart {
	public static void main(String[] args) {
		int r=3;
		int c=4;
		int[][] arr=new int[3][4];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if (i==1 && j==2) {
					System.out.print(1+" ");
				}
				else {
					System.out.print(0+" ");
				}
				
			}
			System.out.println();
			
		}
	}
}
