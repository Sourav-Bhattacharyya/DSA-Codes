package Test_Codes;
public class PalinSub {
	boolean isPalin(String s) {
		int f=0;
		int l=s.length()-1;
		while(f<l) {
			if(s.charAt(f)!=s.charAt(l)) {
				return false;
			}
			f++;
			l--;
		}
		return true;
	}
	void split(String s) {
		int n=s.length();
		for(int i=1;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				String p1=s.substring(0,i);
				String p2=s.substring(i,j);
				String p3=s.substring(j,n);
				if(isPalin(p1) && isPalin(p2) && isPalin(p3)) {
					System.out.println(p1+"\n"+p2+"\n"+p3);
					return;
				}
			}
		}
		System.out.println("Impossible");
	}
	public static void main(String args[]) {
		PalinSub ob = new PalinSub();
		System.out.println("Test Case1:");
		ob.split("nayannamantenet");
		System.out.println("Test Case 2:");
		ob.split("aaaaa");
		System.out.println("Test Case 3:");
		ob.split("aaaabaaaa");
	}
}

