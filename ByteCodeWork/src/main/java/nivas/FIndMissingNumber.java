package nivas;
public class FIndMissingNumber {
	public static void main(String[] args) {
		int a[]= new int[] {1,2,3,4,10,6,7,9,8};
		for(int i=1;i<11;i++) {
			boolean found = false;
			for(int k=0;k<a.length;k++) {
				if(a[k]==i) {
					found = true;
					break;
				}
			}
			if (!found){
				System.out.print(i);
			}
			
		}
		
	}

}
