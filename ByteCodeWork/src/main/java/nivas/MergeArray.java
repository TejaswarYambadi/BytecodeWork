package nivas;
public class MergeArray {
	public static void main(String[] args) {
		int a []= new int[] {1,2,3};
		int b []= new int[] {4,5,6};
		int total = a.length+b.length;
		int c[] = new int[total];
		for(int i=0;i<b.length;i++) {
			c[i]=b[i];
		}
		for(int i = 0;i<a.length;i++) {
			c[b.length+i]=a[i];
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}

}
