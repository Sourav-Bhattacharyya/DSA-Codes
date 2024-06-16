package Test_Codes;
import java.util.*;
public class ChangeDigit {
	int a,b;
	ChangeDigit(int a,int b){
		this.a=a;
		this.b=b;
	}
	int find() {
		char c[]=String.valueOf(a).toCharArray();
		Arrays.sort(c);
		do {
			int d=Integer.parseInt(new String(c));
			if(d>b)
				return d;
		}while(perm(c));
		return -1;
	}
	boolean perm(char c[]) {
		int k=c.length-2;
		while(k>0 && c[k]>=c[k+1]) {
			k--;
		}
		if(k<0) {
			return false;
		}
		int l=c.length-1;
		while(c[l]<=c[k])
			l--;
		char t=c[k];
		c[k]=c[l];
		c[l]=t;
		int s=k+1;
		int e=c.length-1;
		while(s<e) {
			t=c[s];
			c[s]=c[e];
			c[e]=t;
			s++;
			e--;
		}
		return true;
	}
	public static void main(String args[]) {
		ChangeDigit ob = new ChangeDigit(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt());
		System.out.println(ob.find());
	}
}
