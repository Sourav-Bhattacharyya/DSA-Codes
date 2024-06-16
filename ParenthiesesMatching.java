import java.util.*;
public class ParenthiesesMatching {
	char stack[];
	int top;
	ParenthiesesMatching(int n){
		stack=new char[n];
		top=-1;
	}
	void push(char c) {
		stack[++top]=c;
	}
	char pop() {
		return stack[top--];
	}
	boolean check(String s) {
		char a[]=s.toCharArray();
		for(char i:a) {
			if(i=='(' || i=='{' || i=='[')
				push(i);
		    if(top==-1)
			return false;
		    char x='\u0000';
			switch(i) {
			case ')':
				x=pop();
				if(x != '(')
					return false;
				break;
			case '}':
				x=pop();
				if(x != '{')
					return false;
				break;
			case ']':
				x=pop();
				if(x != '[')
					return false;
			}
		}
		return (top==-1);
	}
	public static void main(String args[]) {
		System.out.println("Enter parentheses");
		String s=new Scanner(System.in).next();
		ParenthiesesMatching ob=new ParenthiesesMatching(s.length());
		if(ob.check(s))
			System.out.println("It is balanced");
		else
			System.out.println("It is not balanced");
		
	}
	
}
