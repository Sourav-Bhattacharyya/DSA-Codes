import java.util.*;
public class SumFind {
	void find() {
		int a[]= {2,6,7,8,10,22,69};
		System.out.println("Enter sum to search");
		int x=new Scanner(System.in).nextInt();
		boolean b=true;
		int s=0;
		int k=a.length-1;
		while(s!=k) {
			if(a[s]+a[k]==x) {
				System.out.println("Sum found: "+a[s]+"+"+a[k]);
				b=false;
				break;
			}
			else if(a[s]+a[k]>x)
				k=k-1;
			else
				s=s+1;
		}
		if(b)
			System.out.print("Sum not found");
	}
	public static void main(String args[]) {
		SumFind ob = new SumFind();
		ob.find();
	}
}
