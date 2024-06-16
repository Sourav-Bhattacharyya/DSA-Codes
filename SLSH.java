package Test_Codes;
import java.util.*;
public class SLSH {
	int f[];
	SLSH(int a[]){
		f= new int[4];
	}
	void update(int x[]) {
		int m=f[0];
		for(int i=0;i<4;i++) 
			m=Math.max(m, x[i]);
		f[0]=m;
		m=Integer.MIN_VALUE;
		for(int i=0;i<4;i++)
			if(x[i]>m&&x[i]<f[0])
				m=x[i];
		f[1]=m;
		m=Integer.MAX_VALUE;
		for(int i=0;i<4;i++)
			m=Math.min(m,x[i]);
		f[3]=m;
		m=Integer.MAX_VALUE;
		for(int i=0;i<4;i++)
			if(x[i]<m && x[i]>f[3])
				m=x[i];
		f[2]=m;
	}
	void divide(int a[]) {
		try {
		if(a.length==4)
			update(a);
		else if(a.length==3) {
			int f[]= {a[0],a[1],a[2],a[2]};
			update(f);
		}
		else if(a.length==2) {
			int f[]= {a[0],a[0],a[1],a[1]};
			update(f);
		}
		else if(a.length == 1) {
			int f[]= {a[0],a[0],a[0],a[0]};
			update(f);
		}
		else {
			int m=a.length/2;
			divide(Arrays.copyOfRange(a, 0, m));
			divide(Arrays.copyOfRange(a, m+1, a.length-1));
		}
	    }catch(ArrayIndexOutOfBoundsException e) {
	    	System.out.println(e);
	    }
	}
	public static void main(String args[]) {
		int n=0;
		System.out.println("Enter number of elements");
		n=new Scanner(System.in).nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
			a[i]=new Scanner(System.in).nextInt();
		SLSH ob = new SLSH(a);
		ob.divide(a);
		System.out.println("The second largest is: "+ob.f[1]+"\nSecond Lowest is: "+ob.f[2]);
	}
}
