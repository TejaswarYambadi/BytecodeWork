import java.util.Scanner;
public class MarkTracker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//
		System.out.println("Enter row size = ");
		int r = sc.nextInt();
		System.out.println("Enter column size = ");
		int c = sc.nextInt();
		System.out.println("Enter elements in row wise = ");
		float [][] arr = new float[r][c];
		for(int i=0;i<r;i++) {
			for(int j =0;j<c;j++) {
				arr[i][j]=  sc.nextFloat();
			}
		}
		for(int i=0;i<r;i++) {
			float count=0;
			float p = c;
			for(int j=0;j<c;j++) {
				count+=arr[i][j];
			}
			System.out.println(count/7);
		}
		System.out.println();
	}
}
