import java.util.*;
public class LinkedList {
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next= null;
		}
	}
	Node head;
	static LinkedList insert(LinkedList list,int d) {
		Node nn=new Node(d);
		nn.next=null;
		if(list.head==null) {
			list.head=nn;
		}
		else {
			Node last=list.head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=nn;
		}
		return list;
	}
	public static void disp(LinkedList list) {
		Node cc=list.head;
		while(cc!=null) {
			System.out.print(cc.data+",");
			cc=cc.next;
		}
		System.out.println();
	}
	public static LinkedList del_by_key(LinkedList list,int key ) {
		Node tr=list.head, prev=null;
		if(tr.data==key) {
			list.head=tr.next;
			System.out.println("Element found and deleted");
			return list;
		}
		while(tr.next != null && tr.data!=key) {
			prev=tr;
			tr=tr.next;
		}
		if(tr.data==key) {
			prev.next=tr.next;
			System.out.printf("Element found and deleted");
		}
		else {
			System.out.println("Element not found");
		}
		return list;
	}
	public static void main(String args[]) {
		LinkedList list=new LinkedList();
		System.out.println("Enter number of lists to add");
		int n=new Scanner(System.in).nextInt();
		System.out.println("Enter datas");
		for(int i=0;i<n;i++) {
			list = insert(list,new Scanner(System.in).nextInt());
		}
		int e;
		do {
			System.out.println("Enter choice:\n(1)Add Node\n(2)View list(3)Delete element by key");
			int c=new Scanner(System.in).nextInt();
			switch(c) {
			case 1: System.out.println("Enter element");
			        list = insert(list,new Scanner(System.in).nextInt());
			        break;
			case 2: disp(list); break;
			case 3: 
				System.out.println("Enter key value");
				list = del_by_key(list,new Scanner(System.in).nextInt());
				break;
			default: System.out.println("Wrong choice");
			}
			System.out.println("Do you want to exit?(1/0)");
			e=new Scanner(System.in).nextInt();
		}while(e!=1);
	}
}
