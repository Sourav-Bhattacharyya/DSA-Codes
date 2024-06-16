import java.util.*;
public class LinkedListPalin extends ReverseLinkedList {
	static String formRev(ReverseLinkedList list) {
		Node trav=list.head;
		String s="";
		while(trav!=null) {
			s+=trav.data;
			trav=trav.next;
		}
		return s;
	}
	public static void main(String args[]) {
		System.out.println("Enter number of elements");
		int n=new Scanner(System.in).nextInt();
		ReverseLinkedList list = new ReverseLinkedList();
		System.out.println("Enter elements to the list");
		for(int i=0;i<n;i++)
			add(new Scanner(System.in).nextInt(),list);
		if(formRev(list).equals(formRev(reverse(list))))
			System.out.println("The list is palindrome");
		else 
			System.out.println("The list is not palindrome");
	}
}
