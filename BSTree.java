import java.util.*;
public class BSTree {
	class Node{
		Node left,right;
		int d;
		Node(int da){
			d=da;
			left=right=null;
		}
	}
	Node root;
	void insert(int d) {
		if(root==null) {
			root=new Node(d);
			return;
		}
		Node t=root;
		Node p=null;
		while(t!=null) {
			if(t.d==d) 
				return;
			if(d<t.d) {
				p=t;
				t=t.left;
				}
			else {
				p=t;
				t=t.right;
			}
		}
		if(d>p.d) 
			p.right=new Node(d);
		else
			p.left=new Node(d);
	}
	void pre(Node n){
	      System.out.print(n.d+",");
	      if(n.left==null)
	      return;
	      else
	      pre(n.left);
	      if(n.right==null)
	      return;
	      else
	      pre(n.right);
	  }
	  void post(Node n){
	      if(n==null)  
	      return;
	      post(n.left);
	      post(n.right);
	      System.out.print(n.d+",");
	  }
	  void inod(Node n){
	      if(n==null)
	      return;
	      inod(n.left);
	      System.out.print(n.d+",");
	      inod(n.right);
	 }
	  public static void main(String args[]) {
		  BSTree ob=new BSTree();
		  char c;
		  do {
		    System.out.println("Press (1)Insert element (2)Inorder Traversal (3)Pre Order Traversal (4)Post order Traversal");
		    int n=new Scanner(System.in).nextInt();
		    switch(n) {
		    case 1: 
		    	System.out.print("Enter data");
		    	ob.insert(new Scanner(System.in).nextInt());
		    	break;
		    case 2:
		    	ob.inod(ob.root);
		    	break;
		    case 3: 
		    	ob.pre(ob.root);
		    	break;
		    case 4: 
		    	ob.post(ob.root);
		    	break;
		    default: System.out.println("Wrong choice"); 
		    }
		    System.out.println("Do you want to exit?(Y/N)");
		    c=new Scanner(System.in).next().charAt(0);
		  }while(c!='Y');
		  
	  }
}
