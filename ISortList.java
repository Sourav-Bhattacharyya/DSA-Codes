import java.util.*;
public class ISortList {
	private class Node{
		Node next; int d;
		Node(int d){
			next=null;
			this.d=d;
		}
	}
	Node head;
	void accept(int n) {
		System.out.println("Rnter data");
		head = new Node(new Scanner(System.in).nextInt());
		Node temp;
		for(int i=1;i<n;i++) {
			temp=new Node(new Scanner(System.in).nextInt());
			insert(temp);
		}
	}
	void insert(Node t) {
		if(t.d<head.d) {
			t.next=head;
			head=t;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			if((temp.next).d>t.d) {
				Node x=temp.next;
				temp.next=t;
				t.next=x;
				return;
			}
			temp=temp.next;
		}
		temp.next=t;
	}
	void disp() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.d+",");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String args[]) {
		System.out.println("Enter number of nodes");
		ISortList ob = new ISortList();
		ob.accept(new Scanner(System.in).nextInt());
		System.out.println("The sorted list: ");
		ob.disp();
	}
}
