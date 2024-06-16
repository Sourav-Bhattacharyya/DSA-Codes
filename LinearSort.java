package Test_Codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearSort {
    List<Integer> l;
    int n;
    LinearSort(int n){
        this.n=n;
        l= new ArrayList<>();
    }
    void sot(){
        int a[]=new int[3];
        for(int i:l)
        a[i]++;
        int k=0;
        while(a[0]!=0){
            l.set(k++,0);
            a[0]--;
        }
        while(a[1]!=0){
            l.set(k++, 1);
            a[1]--;
        }
        while(a[2]!=0){
            l.set(k++, 2);
            a[2]--;
        }
    }
    void disp(){
        for(int i:l){
            System.out.print(i+",");
        }
        System.out.println();
    }
    void accept(){
        for(int i=0;i<n;i++)
        l.add(new Scanner(System.in).nextInt());
    }
    public static void main(String[] args) {
        LinearSort ob = new LinearSort(new Scanner(System.in).nextInt());
        ob.accept();
        ob.sot();
        ob.disp();
    }
    
}
