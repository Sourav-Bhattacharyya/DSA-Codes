package Test_Codes;
import java.util.*;
public class JobSeq {
	int ded;int pr;String id;
	JobSeq(){}
	JobSeq(int d, int p,String i){
		ded=d;
		pr=p;
		id=i;
	}
	void sort(JobSeq a[]) {
			for(int i=0;i<a.length;i++) {
				int m=i;
				for(int j=i;j<a.length;j++) {
						if(a[j].pr>a[m].pr)
							m=j;
				}
				JobSeq t=a[m];
				a[m]=a[i];
				a[i]=t;
			}
	}
	void sequence(JobSeq a[], int t) {
			boolean arr[]=new boolean[t];
			String x[]=new String[t];
			for(int i=0;i<a.length;i++) {
				for(int j = Math.min(t, a[i].ded)-1;j>=0;j--) {
					if(!arr[j]) {
						x[j]=a[i].id;
						arr[j]=true;
						break;
					}
				}
			}
			for(String i:x) {
				System.out.print(i);
			}
			System.out.println();
	}
	public static void main(String args[]) {
			JobSeq ob = new JobSeq();
			System.out.println("Enter number of jobs");
			int n=new Scanner(System.in).nextInt();
			JobSeq a[] = new JobSeq[n];
			for(int i=0;i<n;i++) {
				System.out.println("Enter the deadline, profit and id");
				a[i]=new JobSeq(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt(),new Scanner(System.in).next());
			}
			ob.sort(a);
			for(int i=0;i<n;i++)
				System.out.println(a[i].id);
			System.out.println("Enter the deadlines");
			ob.sequence(a, new Scanner(System.in).nextInt());
	}
}
