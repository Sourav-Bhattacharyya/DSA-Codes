import java.util.*;
public class InfixToPostfix {
	char stack[]; int top;
	InfixToPostfix(int n){
		stack=new char[n];
		top=-1;
	}
	String post(String s) {
		char c[]=s.toCharArray();
		String n="";
		for(char i:c) {
			if(Character.isLetterOrDigit(i))
				n+=i;
			else if(i=='(')
				push(i);
			else if(i==')') {
				while(top!=-1 && stack[top]!='(') {
					n+=pop();
				}
				pop();
			}
			else {
				while(top!=-1 && prec(i)<=prec(stack[top])) {
					n+=pop();
				}
				push(i);
			}
		}
		while(top!=-1) {
			if(stack[top]=='(')
				return "Invalid";
			n+=pop();
		}
		return n;
	}
	void push(char c) {
		stack[++top]=c;
	}
	char pop() {
		return stack[top--]; 
	}
	int prec(char c) {
		if("+-".indexOf(c+"")>-1)
			return 1;
		else if("*%/".indexOf(c+"")>-1)
			return 2;
		else if(c=='^')
			return 3;
		else
			return -1;
	}
	public static void main(String args[]) {
		System.out.println("Enter an expression");
		String s=new Scanner(System.in).next();
		InfixToPostfix ob =new InfixToPostfix(s.length());
		System.out.println("The postfix expression is:"+ob.post(s));
	}
}
