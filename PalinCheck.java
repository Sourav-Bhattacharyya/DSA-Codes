package Test_Codes;
import java.util.*;
public class PalinCheck {
	String s;int n;
	PalinCheck(){
		s="";
		n=0;
	}
	void remove() {
		String k="";
		for(int i=0;i<n;i++) {
			if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(0)))
				k+=Character.toLowerCase(s.charAt(i));
		}
		s=k;
		n=s.length();
	}
	boolean saveIronman() {
		for(int i=0;i<=n/2;i++) {
			if(s.charAt(i)!=s.charAt(n-i-1))
				return false;
		}
		return true;
	}
	public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of test cases");
			int t=sc.nextInt();
			PalinCheck ob=new PalinCheck();
			for(int i=0;i<t;i++) {
				System.out.println("Enter String");
				ob.s=new Scanner(System.in).nextLine();
				ob.n=ob.s.length();
				ob.remove();
				if(ob.saveIronman())
					System.out.println("YES");
				else
					System.out.println("NO");
			}
	}
}
