package Arrays_2D;


import java.util.Scanner;
public class AttendanceTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
		int r =5;
		int c =3;
		int[][] arr= new int[r][c];
		for(int j =0;j<c;j++) {
			for(int i=0;i<r;i++) {
				arr[i][j]= sc.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j =0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
