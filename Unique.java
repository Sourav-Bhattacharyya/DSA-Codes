package Test_Codes;
import java.util.Scanner;
public class Unique {
	void count(int n1,int n2) {
		int c=0;
		for(int i=n1;i<=n2;i++) {
				c=isUnique(i)?c+1:c;
		}
		System.out.println(c);
	}
	boolean isUnique(int a) {
			int x=(int)(Math.log10(a)+1);
			if(x==1)
				return true;
			if(x==2) {
				int t=a/10;
				int u=a%10;
				if(t!=u)
					return true;
				else
					return false;
			}
			if(x==3) {
				int h=a/100;
				int t=(a%100)/10;
				int u=a%10;
				if(h==t || h==u || t==u)
					return false;
				else 
					return true;
			}
			return false;
	}
	public static void main(String args[]) {
			Unique ob = new Unique();
			System.out.println("Enter value of n1 and n2 (n1<=n2<=999)");
			int n1=new Scanner(System.in).nextInt();
			int n2=new Scanner(System.in).nextInt();
			ob.count(n1,n2);
	}
}
