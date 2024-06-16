package Test_Codes;
import java.util.*;
public class FakePalin {
	boolean fakePlain(String s) {
		char c[]=s.toCharArray();int a=0;
			for(int i=0;i<c.length;i++) {
				if(s.substring(0,i).indexOf(c[i])<0) {
					int x=0;
					for(int j=0;j<c.length;j++)
						if(c[i]==c[j])
							x++;
					if(x%2!=0)
						a++;
				}
			}
			return a<=1;
	}
	int comb(String s) {
		int c=0;
		for(int i=1;i<s.length();i++) {
			for(int j=i;j<=s.length();j++) {
				if(fakePlain(s.substring(i,j)))
					c++;
			}
		}
		return c;
	}
	public static void main(String args[]) {
		FakePalin ob=new FakePalin();
		System.out.println("Enter string");
		String s=new Scanner(System.in).next();
		System.out.println(ob.comb(s));
	}
}
