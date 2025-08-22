package exam;
public class Task4 {
	public static void main(String[] args) {
		int[][] matrix = {
			    { 1,  2,  3},
			    { 4,  5,  6},
			    { 7,  8,  9}
			};
		int top=0;
		int right=3;
		int bottom=3;
		int left=0;
		for(int i=top;i<right;i++) {
			System.out.print(matrix[0][i]+" ");
		}
		for(int i=1;i<bottom;i++) {
			System.out.print(matrix[i][2]+" " );
		}
		for(int i=1;i>=left;i--) {
			System.out.print(matrix[2][i]+" ");
		}
		for(int i=0;i<2;i++) {
			System.out.print(matrix[1][i]+" ");
		}
		
	}

}
