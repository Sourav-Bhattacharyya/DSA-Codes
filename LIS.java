package Test_Codes;
import java.util.*;
public class LIS {
	void findLis(int arr[]) {
		int n=arr.length;
		int lis[]=new int[n];
		int prev[]=new int[n];
		lis[0]=0;
		prev[0]=-1;
		for(int i=1;i<n;i++) {
			int maxlen=1;
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					maxlen=Math.max(maxlen, lis[j]+1);
					prev[i]=j;
				}
				lis[i]=maxlen;	
			}
		}
		int ml=0;
		for(int i:lis) {
			ml=Math.max(ml,i);
		}
		int r[]=new int[ml];
		int j=ml-1;
		for(int i=n-1;i>=0 && j>=0; i--) {
			if(lis[i]==ml--) {
				r[j--] = arr[i];
			}
		}
		for(int i:r) {
			System.out.print(i+",");
		}
	}
	public static void main(String args[]) {
		System.out.println("Enter number of elements");
		int n=new Scanner(System.in).nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
			arr[i]=new Scanner(System.in).nextInt();
		new LIS().findLis(arr);
	}
}
