import java.util.*;
public class StackQueue {
	int a[];int front,rear;
	StackQueue(){
		a=new int[5];
		front=0;
		rear=-1;
	}
	void push(int d) {
		if(rear==4) {
			System.out.println("Over Flow");
			return;
		}
		enqueue(d,++rear);
	}
	void enqueue(int d,int t) {
		a[t]=d;
	}
	void pop(StackQueue ob1, StackQueue ob2) {
		if(ob2.front==ob2.rear+1) {
			System.out.println("Underflow");
			return;
		}
		while(ob2.rear+1!=ob2.front) {
			ob1.enqueue(dequeue(ob2,ob2.front++),(ob2.rear - ob2.front +1));
			ob1.rear++;
		}
		System.out.println("Deleted element= "+ob1.a[ob1.front++]);
		ob2.rear=-1;ob2.front=0;
		while(ob1.rear+1!=ob1.front) {
			this.enqueue(dequeue(ob1,ob1.front++),ob1.rear -ob2.front+1);
			ob2.rear++;
		}
		ob1.rear=-1;ob1.front=0;
		
	}
	int dequeue(StackQueue ob, int t) {
		return ob.a[t];
	}
	void display() {
		if(front == rear+1) {
			System.out.println("Empty");
			return;
		}
		for(int i=front;i<=rear;i++)
			System.out.print(a[i]+",");
		System.out.println();
	}
	public static void main(String args[]) {
		StackQueue ob=new StackQueue();
		StackQueue ob1=new StackQueue();
		do {
			System.out.println("Enter (1)For inserting (2)For deletion (3)Display");
			switch(new Scanner(System.in).nextInt()) {
				case 1:
					System.out.println("Enter element");
					ob1.push(new Scanner(System.in).nextInt());
					break;
				case 2: 
					ob1.pop(ob,ob1);
					break;
				case 3: ob1.display();break;
				default: System.out.println("Wrong choice");
			}
			System.out.println("Do you want to exit?(1/0)");
		}while(new Scanner(System.in).nextInt()!=1);
	}
	
}
