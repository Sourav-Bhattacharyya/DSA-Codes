import java.util.*;
public class Printing {
	static int a[];
	static int n;
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int c[]=new int[n];
		for(int i=0;i<=n/2;i++) {
			c[n-i-1]=a[i];
			c[i]=a[n-i-1];
		}
		System.out.println("The array prodeced");
		for(int i:c) 
			System.out.print(i+",");
	}
}
