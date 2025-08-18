package newarrays;
import java.util.Scanner;
public class Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of blocks=");
        int block=sc.nextInt();
        int[][][] a=new int[block][][];
        for(int i=0;i<block;i++){
            System.out.print("Enter no of rows in block "+(i+1)+"=");
            int row=sc.nextInt();
            a[i]=new int[row][];
            for(int j=0;j<row;j++){
                System.out.print("Enter columns for block "+(i+1)+" row "+(j+1)+"=");
                int col=sc.nextInt();
                a[i][j]=new int[col];
                for(int k=0;k<col;k++){
                    a[i][j][k]=sc.nextInt();
                }
            }
        }
        System.out.println("\nJagged 3D Array:");
        for(int i=0;i<a.length;i++){
            System.out.println("Block "+i+":");
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println();
            }
        }
    }
}
