import java.util.*;
public class MergeList extends LinkedList {
	static LinkedList merge(LinkedList list1, LinkedList list2) {
		Node x1=list1.head;
		Node x2=list2.head;
		LinkedList list3=new LinkedList();
		while(x1!=null || x2!=null) {
			if(x1==null) {
				list3=insert(list3,x2.data);
				x2=x2.next;
			}
			else if(x2==null) {
				list3=insert(list3,x1.data);
				x1=x1.next;
			}
			else {
				if(x1.data<x2.data) {
					list3=insert(list3,x1.data);
					x1=x1.next;
				}
				else {
					list3=insert(list3,x2.data);
					x2=x2.next;
				}
			}
		}
		return list3;
	}
	public static void main(String args[]) {
		System.out.println("Enter number of elements in list 1");
		int n=new Scanner(System.in).nextInt();
		LinkedList list1=new LinkedList();
		System.out.println("Enter elements to the first list");
		for(int i=0;i<n;i++){
			list1=insert(list1,new Scanner(System.in).nextInt());
		}
		System.out.println("Enter number of elements to the second list");
		LinkedList list2 = new LinkedList();
		n=new Scanner(System.in).nextInt();
		System.out.println("Enter elements to list2");
		for(int i=0;i<n;i++)
			list2 =insert(list2, new Scanner(System.in).nextInt());
		LinkedList list3=merge(list1,list2);
		disp(list3);
	}
}
