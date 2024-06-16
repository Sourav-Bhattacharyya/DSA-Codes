import java.util.*;
public class NextGreat {
	int queue[];
	int front,rear;
	NextGreat(int n){
		queue=new int[n];
		front=0;
		rear=-1;
	}
	int nextGreat(int x) {
		while(front!=rear+1) {
			if(queue[front]>queue[x])
				return front;
			dequeue();
		}
		return -1;
	}
	void dequeue() {
		front++;
	}
	void enqueue(int d) {
		queue[++rear]=d;
	}
	public static void main(String args[]) {
		System.out.println("Enter array size");
		int n=new Scanner(System.in).nextInt();
		NextGreat ob=new NextGreat(n);
		System.out.println("Enter elements to the array");
		for(int i=0;i<n;i++)
			ob.enqueue(new Scanner(System.in).nextInt());
		
		for(int i=0;i<n-1;i++) {
			ob.front=i;
			int x=ob.nextGreat(i);
			if(x!=-1)
				System.out.println("Element= "+ob.queue[i]+"\nNext Greatest= "+ob.queue[x]);
			else
				System.out.println("No next greatest for "+ob.queue[i]);
		}
		System.out.println("Last element has no greatest next");
		
	}
}
