package assignements;

public class ClassSeating {
	public static void main(String[] args) {
		int sum=0;
		int max=0;
		int[][] classroom = {
			    {101, 102, 103, 104, 105},
			    {106, 107, 108, 109, 110},
			    {111, 112, 113, 114, 115},
			    {116, 117, 118, 119, 120}
			};
		System.out.println("Entire matrix in a well-formatted way");
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(classroom[i][j]+"   ");
				int a=classroom[i][j];
				sum+=a;
				if(max<a) {
					max=a;
				}
			}
			System.out.println();
		}
		System.out.println("total sum = "+sum);
		System.out.println("Largest student ID = "+max);
		System.out.println("Sum of student ID from Row Wise");
		for(int i=0;i<4;i++) {
			int csum=0;
			for(int j=0;j<5;j++) {
				int rsum=0;
				int b = classroom[i][j];
				csum+=b;
			}
			System.out.println("Sum of Row "+i+ " " +csum);
		}
	}

}
