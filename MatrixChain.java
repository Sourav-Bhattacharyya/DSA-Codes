package Test_Codes;
import java.util.*;
public class MatrixChain {
	int s; int d[];
	MatrixChain(int s){
			this.s=s;
			d=new int[s+1];
			
	}
	int find() {
		int w[][]=new int[s+1][s+1];
		for(int i=1;i<s;i++)
			w[i][i]=0;
		for(int x=1;x<s;x++) {
			for(int i=1;i<=s-x;i++) {
				int j=i+x;
				w[i][j]=Integer.MAX_VALUE;
				for(int k=i;k<j;k++) 
					 w[i][j]=Math.min(w[i][j], w[i][k]+w[k+1][j]+(d[i-1]*d[k]*d[j]));
			}
		}
		return w[1][s];
	}
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of matrices");
			MatrixChain ob = new MatrixChain(sc.nextInt());
			System.out.println("Enter the dimentions");
			for(int i=0;i<ob.d.length;i++)
				ob.d[i]=sc.nextInt();
			System.out.println("Optimal number of multiplications= "+ob.find());
	}
}
