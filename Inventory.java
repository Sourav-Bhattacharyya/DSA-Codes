import java.util.*;
public class Inventory {
	int a[][];
	Inventory(){
		a=new int[100][3];
	}
	void add(int id,int q,int p,int i) {
		if(search(id)==-1) {
			a[i][0]=id;
			a[i][1]=q;
			a[i++][2]=p;
		}
		else
			System.out.println("Product already present");
	}
	void quant(int id, int q) {
		int c=search(id);
		if(c==-1)
			System.out.println("ID not found");
		else {
			a[c][1]+=q;
		}
	}
	void remove(int id,int q) {
		int c=search(id);
		if(c==-1)
			System.out.println("ID not found");
		else {
			a[c][1]=a[c][1]<=0?0:a[c][1]-q;
			a[c][1]=a[c][1]<0?0:a[c][1];
		}
	}
	void display() {
		int i=0;
		System.out.println("Product_ID\tQuantity\tPrice");
		while(a[i][0]!=0) {
			System.out.println(a[i][0]+"\t"+a[i][1]+"\t"+a[i][2]);
			i++;
		}
	}
	void price(int id,int p) {
		int c=search(id);
		if(c==-1)
			System.out.println("ID not found");
		else {
			a[c][2]=p;
		}
	}
	void value() {
		int i=0;
		int s=0;
		while(a[i][0]!=0)
			s+=a[i][1]*a[i][2];
		System.out.println("The total value of the inventory= "+s);
	}
	int search(int x){
	    int i=0;
	    while(a[i][0]!=0){
	        if(a[i][0]==x)
	        return i;
	        i++;
	    }
	    return -1;
	}
	public static void main(String args[]) {
		Inventory ob=new Inventory();
		int c;int i=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter choice:\n(1)Add product to the inventory\n(2)Update quantity of Product\n(3)"
					+ "Remove quantity\n(4)Display the inventory"
					+ "\n(5)Update price of the items\n(6)Calculate value of the inventory");
			int x=sc.nextInt();
			switch(x) {
			case 1:System.out.println("Enter ID, quantityand price");
			ob.add(sc.nextInt(),sc.nextInt(),sc.nextInt(),i++);
			break;
			case 2:
				System.out.println("Enter ID amd quantity");
				ob.quant(sc.nextInt(), sc.nextInt());
				break;
			case 3:
				System.out.println("Enter ID and quantity to be removed");
				ob.remove(sc.nextInt(), sc.nextInt());
				break;
			case 4:
				ob.display(); break;
			case 5: 
				System.out.println("Enter ID and new price");
				ob.price(sc.nextInt(),sc.nextInt());
				break;
			case 6: ob.value(); break;
			default: System.out.println("Wrong choice");
		}
		System.out.println("Do you want to exit?(1/0)");
		c=sc.nextInt();
	}while(c!=1);
	}

}
