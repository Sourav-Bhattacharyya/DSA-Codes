import java.util.*;
public class MergeSort {
	int a[], b[];
	 int n,m;
	 void accept() {
		 System.out.println("Enter array sizes");
		 n=new Scanner(System.in).nextInt();
		 m=new Scanner(System.in).nextInt();
		 a=new int[n]; b=new int[m];
		 System.out.println("Enter array elements to the first array");
		 for(int i=0;i<n;i++)
			 a[i]=new Scanner(System.in).nextInt();
		 System.out.println("Enter elements to the second array");
		 for(int i=0;i<m;i++)
			 b[i]=new Scanner(System.in).nextInt();
		 int c[]=new int[n+m];
		 int k=0,x=0;
		 for(int i=0; i<n+m; i++) {
			  int ma=min(a,k);
			  int mb=min(b,x);
			  c[i]=Math.min(a[ma], b[mb]);
			  if(a[ma]<b[mb]) {
				  int t=a[k];
				  a[k++]=a[ma];
				  a[ma]=t;
			  }
			  else {
				  int t=b[x];
				  b[x++]=b[mb];
				  b[mb]=t;
			  }
		  }
		 System.out.println("The sorted array is:");
		 for(int i:c) {
			 System.out.print(i+",");
		 }
	 }
	 int min(int x[],int y) {
		 int m=y;
		 if(m==x.length)
			 return (x.length-1);
		 for(int i=y;i<x.length;i++) {
			 if(x[i]<x[m])
				 m=i;
		 }
		 return m;
	 }
	 public static void main(String args[]) {
		 MergeSort ob=new MergeSort();
		 ob.accept();
	 }
}
