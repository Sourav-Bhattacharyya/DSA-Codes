package Test_Codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestSum {
    int n; List<Integer> c;
    LargestSum(int n){
        this.n=n;
        c= new ArrayList<>();
    }
    void accept(){
        for(int i=0;i<n;i++)
        c.add(new Scanner(System.in).nextInt());
    }
    int find(){
        int s=0;
        boolean b=true;
        int max=c.get(0);
        for(int i:c){
            if(i>=0){
                s+=i;
                b=false;
            }
            else
            max=Math.max(max, i);
        }
        if(b)
        return max;
        else
        return s;
    }
    public static void main(String[] args) {
        LargestSum ob=new LargestSum(new Scanner(System.in).nextInt());
        ob.accept();
        System.out.println("The largest sum= "+ob.find());
    }
}
