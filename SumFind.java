package Test_Codes;
import java.util.*;
public class SumFind {
	int subSum(int a[],int n,int sum) {
			int s[][]=new int[n+1][sum+1];
			s[0][0]=1;
			for(int i=1;i<=sum;i++)
				s[0][i]=0;
			for(int i=1;i<=n;i++) {
				for(int j=0;j<=sum;j++) {
					if(a[i-1]>j) {
							s[i][j]=s[i-1][j];
					}
					else {
						s[i][j]=s[i-1][j]+s[i-1][j-a[i-1]];
					}
				}
			}
			return s[n][sum];
	}
	public static void main(String args[]) {
			SumFind ob=new SumFind();
			System.out.println("Enter number of array elements");
			int n=new Scanner(System.in).nextInt();
			int a[]=new int[n];
			System.out.println("Enter array elements");
			for(int i=0;i<n;i++)
				a[i]=new Scanner(System.in).nextInt();
			System.out.println("Enter sum");
			int sum=ob.subSum(a, n, new Scanner(System.in).nextInt());
			System.out.println(sum);
	}
}
