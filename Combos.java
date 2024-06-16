package Test_Codes;
import java.util.*;
public class Combos {
	int find(int n) {
		if(n==0)
			return 1;
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		return (n-1)*(find(n-1)+find(n-2));
	}
	public static void main(String args[]) {
			Combos ob=new Combos();
			System.out.println("Enter number of books and students");
			int n=new Scanner(System.in).nextInt();
			System.out.println(ob.find(n)%10000007);
	}
}
