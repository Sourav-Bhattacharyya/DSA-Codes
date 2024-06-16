package Test_Codes;
import java.util.*;
public class Sub01 {
    int n;
    int a[];
    Sub01(int n){
        this.n = n;
        a = new int[n];
    }
    void receive(){
        for(int i=0; i < n; i++){
            a[i]=new Scanner(System.in).nextInt();
        }
    }
    void find(){
        int c0=0;int c1=1;
        for(int i=0; i<=n; i++){
            if(a[i]==0)
            c0++;
        }
        c1=n-c0-1;
        if(c1==n-1 || c0==n-1){
            System.out.println("[]");
            return;
        }
        int k=0;
        c1=Math.min(c1, c0);
        c0=Math.min(c1, c0);
        while(c1!=0 || c0!=0){
            
        }
    }
}
