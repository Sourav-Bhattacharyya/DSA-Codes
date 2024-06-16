package Test_Codes;
public class TSP {
	int find(int dist[][],int n) {
			int dp[][]=new int[(1<<n)][n];
			for(int i=0;i<n;i++)
				dp[(1<<i)][i]= 0;
			for(int m=1;m<(1<<n);m++) {
					for(int i=0;i<n;i++) {
							if((m&(1<<i))==0)
								continue;
							int mv= Integer.MAX_VALUE;
							for(int j=0;j<n;j++) {
									if((m&(1<<j))==0 || i==j)
										continue;
									mv=Math.min(mv, dp[m^(1<<i)][j]+dist[j][i]);
							}
							dp[m][i]=mv;
					}
			}
			int mv=Integer.MAX_VALUE;
			for(int i=0;i<n;i++)
				mv=Math.min(mv, dp[(1<<n) - 1][i]+dist[i][0]);
			return mv;
	}
	public static void main(String args[]) {
			TSP ob=new TSP();
			int dist[][]= {
					{ 0, 10, 15, 20 },
					{ 10, 0, 25, 25 },
					{ 15, 25, 0, 30 },
					{ 20, 25, 30, 0 }
			};
			int n=4;
			System.out.println("The min cost is: "+ob.find(dist, n));
	}
}
