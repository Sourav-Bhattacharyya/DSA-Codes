import java.util.*;
public class SLSS {
	int mr[]=new int[4];
	int ml[]=new int[4];
	void divide(int a[]){
		int l[];int r[];
		if(a.length>4) {
			int mid=a.length/4;
			 l=Arrays.copyOfRange(a, 0, mid);
		     r=Arrays.copyOfRange(l, mid+1, a.length-1);
			divide(l);
			divide(r);
		}
		max(l,r);
	}
	void max(int l[],int r[]) {
		if(l.length==4 && r.length==4) {
			for(int i=0;i<l.length;i++) {
				ml[3]=Math.max(ml[3], l[i]);
				ml[0]=Math.max(ml[0], l[i]);
				mr[3]=Math.max(mr[3], r[i]);
				mr[0]=Math.max(mr[0], r[i]);
			}
			for(int i=0;i<l.length;i++) {
				if(l[i]>ml[2]&&l[i]<ml[3])
					ml[2]=l[i];
				else if(l[i]<ml[1]&&l[i]>ml[0])
					ml[1]=l[i];
				if(r[i]>mr[2]&&r[i]<mr[3])
					mr[2]=r[i];
				else if(r[i]<mr[1]&&r[i]>mr[0])
					mr[1]=r[i];
			}
		}
		else if(l.length<4)
			
	}
}
