package Test_Codes;

import java.util.Arrays;

public class B2d {
	int[] find(int a[][],int x) {
		int r=0, c=a[0].length-1;
		while(r<a.length && c>=0) {
			if(a[r][c]==x)
				return new int[] {r,c};
			else if(x>a[r][c]) {
				r++;
			}
			else
				c--;
		}
		return new int[] {-1,-1};
	}
	public static void main(String args[]) {
		B2d ob = new B2d();
		int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };
		int[] ans = ob.find(arr, 7);
		System.out.println("Element found at index: "+  Arrays.toString(ans));
	}
}
