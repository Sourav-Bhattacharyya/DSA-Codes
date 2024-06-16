import java.util.*;
public class JobSequence {
	private class Jobs{
		int pr,ti;char id;Jobs next;boolean cch;
		Jobs(int pr,int ti,char id){
			this.pr=pr;
			this.ti=ti;
			this.id=id;
			cch=false;
			next=null;
		}
	}
	Jobs head;Jobs last;
	JobSequence(){
		head=null;
	}
	void add(int pr,int ti,char id) {
		if(head == null) {
			head=new Jobs(pr,ti,id);
			last=head;
			return;
		}
		last.next=new Jobs(pr,ti,id);
		last=last.next;
	}
	Jobs merge(Jobs a,Jobs b) {
		if(a==null)
			return b;
		if(b==null)
			return a;
		Jobs result;
		if(a.pr>=b.pr) {
			result=a;
			result.next=merge(a.next,b);
		}
		else {
			result=b;
			result.next=merge(a,b.next);
		}
		return result;
	}
	Jobs divide(Jobs x) {
		if(x==null || x.next==null)
			return x;
		Jobs mid=findMid(x);
		Jobs rmid=mid.next;
		mid.next=null;
		Jobs left=divide(x);
		Jobs right=divide(rmid);
		Jobs done=merge(left,right);
		return done;
	}
	Jobs findMid(Jobs h) {
		if(h==null)
			return h;
		Jobs fast=h,slow=h;
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	void findSeq(int t) {
		boolean seq[]=new boolean[t];
		Jobs temp=head;
		while(temp!=null) {
			if(temp.ti<t&&seq[temp.ti-1]==false) {
				seq[temp.ti-1]=true;
				System.out.print(temp.id+" ");
				}
			temp=temp.next;
		}
	}
	/*void printlist() {
		Jobs temp=head;
		while(temp!=null) {
			System.out.println(temp.pr);
			temp=temp.next;
		}
	}*/
	public static void main(String args[]) {
		JobSequence ob=new JobSequence();
		System.out.println("Enter number of jobs in the list");
		int n=new Scanner(System.in).nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter profit, deadline, JobID");
			ob.add(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt(), new Scanner(System.in).next().charAt(0));
		}
		ob.head=ob.divide(ob.head);
		//ob.printlist();
		System.out.println("Enter possible number of jobs.");
		ob.findSeq(new Scanner(System.in).nextInt());
	}
}
