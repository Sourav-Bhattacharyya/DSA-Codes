package Test_Codes;
import java.util.*;
public class EvenCombo {
	int l,h,k;
	void input() {
		l=new Scanner(System.in).nextInt();
		h=new Scanner(System.in).nextInt();
		k=new Scanner(System.in).nextInt();
	}
	
	void find() {
		int dpe[]=new int[k+1] ;
		int dpo[] = new int[k+1];
		dpe[0]=1;
		for(int i=1;i<=k;i++) {
			for(int j=l;j<=h;j++) {
				if(j%2==0) {
					dpe[i]+=dpe[i-1];
					dpo[i]+=dpo[i-1];
				}
				else {
					dpe[i]+=dpo[i-1];
					dpo[i]+=dpe[i-1];
				}
			}
		}
		System.out.println(dpe[k]);
	}
	public static void main(String args[]) {
		EvenCombo ob = new EvenCombo();
		ob.input();
		ob.find();
	}
}
