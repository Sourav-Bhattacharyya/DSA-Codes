import java.util.*;
public class Bitonic {
	int binarySearch(int a[],int left,int right) {
		if(left>=right) 
			return -1;
		int mid=(left+right)/2;
		if(a[mid]>a[mid+1] && a[mid]>a[mid-1]) 
			return a[mid];
		else if(a[mid]<a[mid+1])
			return binarySearch(a,mid+1,right);
		else
			return binarySearch(a,left,mid-1);
	}
	void accept() {
		int a[]= {6, 7, 8, 11, 9, 5, 2, 1};
		int e=binarySearch(a,1,a.length-2);
		if(e==-1)
			System.out.printf("Element not found");
		else
			System.out.println("The element is: "+e);
	}
	public static void main(String args[]) {
		Bitonic ob = new Bitonic();
		ob.accept();
	}
}
