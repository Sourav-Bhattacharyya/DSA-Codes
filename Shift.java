import java.util.*;
public class Shift {
	int a[]; int n;
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int k=0,t=a[0];
		for(int i=1;i<n;i++) {
			k=a[i];
			a[i]=t;
			t=k;
		}
		a[0]=t;
		for(int i:a)
			System.out.print(i+",");
	}
	public static void main(String args[]) {
		Shift ob=new Shift();
		ob.accept();
	}
}
