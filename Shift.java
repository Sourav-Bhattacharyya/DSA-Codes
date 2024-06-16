package Test_Codes;
import java.util.*;
public class Shift {
	int a[],b[];int n;
	Shift(int n){
		a=new int[n];
		b=new int[n];
		this.n=n;
	}
	void move(int k) {
		for(int i=0;i<n;i++) {
			if(i+k>n-1)
				b[i+k-n]=a[i];
			else
				b[i+k]=a[i];
		}
		a=b;
	}
	void disp() {
		for(int i:a)
			System.out.print(i+",");
	}
	public static void main(String args[]) {
			System.out.println("Enter number of elements");
			Shift ob=new Shift(new Scanner(System.in).nextInt());
			System.out.println("Enter array elements");
			for(int i=0;i<ob.n;i++) {
				ob.a[i]=new Scanner(System.in).nextInt();
			}
			System.out.println("Enter move position");
			ob.move(new Scanner(System.in).nextInt());
			ob.disp();
	}
}
