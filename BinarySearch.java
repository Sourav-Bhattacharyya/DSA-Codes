import java.util.*;
public class BinarySearch {
	void accept() {
		int a[]= {1,4,8,16,22,34,68,98,110};
		System.out.println("Enter element to search");
		int n=new Scanner(System.in).nextInt();
		int f=0, r=a.length;
		while(f!=r) {
			int m=(f+r)/2;
			if(a[m]==n) {
				System.out.println("Element found at position "+(m+1));
				break;
			}
			else if(n>a[m])
				f=m+1;
			else
				r=m-1;
		}
		if(f==r)
			System.out.println("Element not found");
	}
	public static void main(String args[]) {
		BinarySearch ob = new BinarySearch();
		ob.accept();
	}
}
