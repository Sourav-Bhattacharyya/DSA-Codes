import java.util.*;
public class ReverseLinkedList {
	static class Node{
		Node next;
		int data;
		Node(int d){
			next=null;
			data=d;
		}
	}
	Node head;
	static ReverseLinkedList add(int d,ReverseLinkedList list) {
		Node newnode=new Node(d);
		if(list.head==null) {
			list.head=newnode;
			return list;
		}
		Node trav=list.head;
		while(trav.next!=null) {
			trav=trav.next;
		}
		trav.next=newnode;
		return list;
	}
	static void disp(ReverseLinkedList list) {
		Node trav=list.head;
		while(trav!=null) {
			System.out.print(trav.data+",");
			trav=trav.next;
		}
		System.out.println();
	}
	static ReverseLinkedList reverse(ReverseLinkedList list) {
		Node trav=list.head;
		Node x=null;Node p=null;
		while(trav!=null) {
			x=trav.next;
			trav.next=p;
			p=trav;
			trav=x;
		}
		list.head=p;
		return list;
	}
	public static void main(String args[]) {
		ReverseLinkedList list=new ReverseLinkedList();
		System.out.println("Enter number of nodes");
		int n=new Scanner(System.in).nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			list=add(new Scanner(System.in).nextInt(),list);
		}
		System.out.println("The entered list: ");
		disp(list);
		list=reverse(list);
		System.out.println("Reversesd list: ");
		disp(list);
	}
}
