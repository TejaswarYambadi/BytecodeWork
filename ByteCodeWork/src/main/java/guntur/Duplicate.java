package guntur;
import java.util.*;

public class Duplicate {
    int a[] = {1, 2, 3, 0, 4, 9, 8, 7, 0, 1, 2, 3};
    int b[] = new int[a.length];
    int c[];
    int x[];
    int ea[],oa[];
    int zc = 0;
    int count = 0;
    public void removeDuplicate() {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                zc++;
                continue;
            } else {
                boolean isdup = false;
                for (int j = 0; j < count; j++) {
                    if (a[i] == b[j]) {
                        isdup = true;
                        break;
                    }
                }
                if (!isdup) {
                    b[count++] = a[i];
                }
            }
        }
        for (int i = 0; i < zc; i++) {
            b[count++] = 0;
        }
    }
    public void removeExtra() {
        c = new int[count];
        for (int i = 0; i < count; i++) {
            c[i] = b[i];
        }
    }
    public void zerocount() {
        x = new int[count - zc];
        int k = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] != 0) {
                x[k++] = c[i];
            }
        }
    }
    public void sep() {
    	ea=new int[x.length];
    	oa=new int[x.length];
    	int ei=0,oi=0;
    	for(int i=0;i<x.length;i++) {
    		if(x[i]%2==0) {
    			ea[ei]=x[i];
    			ei++;
    		}
    		else {
    			oa[oi]=x[i];
    			oi++;
    		}
    	}
    	 ea = Arrays.copyOf(ea, ei);
    	 oa = Arrays.copyOf(oa, oi);
    }
    public int calculate(int a[]) {
    	int many=0;
    	for(int i=0;i<a.length;i++) {
    		many++;
    	}
    return many;
    }
    public static void main(String[] args) {
        Duplicate d = new Duplicate();
        d.removeDuplicate();
        d.removeExtra();
        d.zerocount();
        d.sep();
        int finalevencount =d.calculate(d.ea);
        int finaloddcount=d.calculate(d.oa);
        System.out.println(d.zc);
        System.out.println("Array with all 0s removed: " + Arrays.toString(d.x));
        System.out.println("Even Array " + Arrays.toString(d.ea));
        System.out.println("Odd Array " + Arrays.toString(d.oa));
        System.out.println("Even count = "+finalevencount);
        System.out.println("Odd count = "+finaloddcount);

    }
}
