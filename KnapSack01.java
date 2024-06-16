import java.util.*;
public class KnapSack01 {
	int w;int n;
	int knap(int weight[],int val[]) {
		int m[][]=new int[n+1][w+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=w;j++) {
				if(i==0 || j==0)
					m[i][j]=0;
				else if(weight[i-1]<=j) {
					m[i][j]=Math.max(m[i-1][j],m[i-1][j-weight[i-1]]+val[i-1]);
				}
				else
					m[i][j]=m[i-1][j];
			}
		}
		return m[n][w];
	}
	void input() {
		System.out.println("Enter number of elements");
		n=new Scanner(System.in).nextInt();
		System.out.println("Enter weight of the sack");
		w=new Scanner(System.in).nextInt();
		int wt[]=new int[n];
		int val[]=new int[n];
		System.out.println("Enter the values and the corresponding weights");
		for(int i=0;i<n;i++) {
			val[i]=new Scanner(System.in).nextInt();
			wt[i]=new Scanner(System.in).nextInt();
		}
		System.out.println("The value of the knapsack is: "+knap(wt,val));
	}
	public static void main(String args[]) {
		KnapSack01 ob=new KnapSack01();
		ob.input();
	}
}
