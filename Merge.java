import java.util.Scanner;
public class Merge {
	static int a[], b[];
	static int n;
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		n=sc.nextInt();
		System.out.println("Enter array elements");
		a=new int[n]; b=new int[n];
		int c[]=new int[n+n];
		for(int i=0;i<n+n;i++) {
			if(i<n)
				a[i]=sc.nextInt();
			else
				b[i-n]=sc.nextInt();
			}
		for(int i=0;i<n+n;i++) {
			if(i<n)
			c[i]=a[i];
			else
				c[i]=b[i-n];
		}
		System.out.println("Merged array:");
		for(int i:c)
			System.out.print(i+",");
	}
}