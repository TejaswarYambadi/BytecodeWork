package nivas;
public class RemoveDuplicates {
	public static void main(String[] args) {
		int a[]= {1,1,2,2,4,4};
		int count =0;
	
		for(int i=0;i<a.length;i++) {
			boolean found= false;
			for(int j=i+1;j<a.length;j++) {
				if (a[i]==a[j]) {
					found = true;
					break;
				}
			}
			if(!found) {
				count+=1;
			}
		}
		int b []= new int[count];
		int k=0;
		for(int i=0;i<a.length;i++) {
			boolean found= false;
			for(int j=i+1;j<a.length;j++) {
				if (a[i]==a[j]) {
					found = true;
					break;
				}
			}
			if(!found) {
				b[k++]=a[i];
			}
		}
		for (int x : b) {
            System.out.print(x + " ")//
        }
	}

}
