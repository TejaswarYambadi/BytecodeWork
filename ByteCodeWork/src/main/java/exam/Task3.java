package exam;
public class Task3 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,4,3,2,1};
		int n = a.length;

		        boolean[] visited = new boolean[n];

		        System.out.println("Element frequencies:");
		        for (int i = 0; i < n; i++) {
		            if (visited[i]) continue; {
		            int count = 1;
		            for (int j = i + 1; j < n; j++) {
		                if (a[i] == a[j]) {
		                    count++;
		                    visited[j] = true; 
		                 
		            }
		           
		        }
		            System.out.println(a[i] + " occured " + count);
		    }
		}

		
		
	}

}
