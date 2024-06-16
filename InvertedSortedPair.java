import java.util.*;
public class InvertedSortedPair {
	int merge(int a[],int l,int r) {
		int m=(l+r)/2;
		int left[]=Arrays.copyOfRange(a, l, m+1);
		int right[]=Arrays.copyOfRange(a, m+1, r+1);
		int i=0,j=0,k=l,swap=0;
		while (i<left.length && j<right.length) {
			if(left[i]<=right[j])
				a[k++]= left[i++];
			else {
				a[k++]=right[j++];
				swap+=(m+1)-(l+i);
			}
		}
		while(i<left.length)
			a[k++]=left[i++];
		while(j<right.length)
			a[k++]=right[j++];
		return swap;
	}
	int divide(int a[],int l,int r) {
		int count=0;
		if(l<r) {
			int m=(l+r)/2;
			count+=divide(a,l,m);
			count+=divide(a,m+1,r);
			count+=merge(a,l,r);
		}
		return count;
	}
	void check() {
		 int[] arr = { 1, 20, 6, 4, 5 };
		 System.out.println("No. of Inverted pair= "+divide(arr,0,arr.length-1));
	}
	public static void main(String args[]) {
		InvertedSortedPair ob=new InvertedSortedPair();
		ob.check();
	}
}
