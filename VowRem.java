package Test_Codes;

import java.util.ArrayList;
import java.util.Scanner;

public class VowRem{
    char a; int c;
    VowRem(){}
    VowRem(char a,int c){
        this.a=a;
        this.c=c;
    }
    void populate(String g){
        ArrayList<VowRem> l = new ArrayList<>();
        l.add(new VowRem('a', 0));
        l.add(new VowRem('e', 0));
        l.add(new VowRem('i', 0));
        l.add(new VowRem('o', 0));
        l.add(new VowRem('u', 0));
        count(l,g);
    }
    void count(ArrayList<VowRem> l, String g){
        boolean b=false;
        String s="";
        for(int i=0;i<g.length();i++){
            if("aeiou".indexOf(Character.toLowerCase(g.charAt(i))+"")>=0){
                b=true;
                l.get("aeiou".indexOf(g.charAt(i)+"")).c++;
            }
            else
            s+=g.charAt(i);
        }
        if(!b){
            System.out.println("0");
            //System.out.println(s);
            return;
        }
        for(VowRem i:l){
            System.out.println(i.a+":"+i.c);
        }
        System.out.println(s);
    }
    public static void main(String args[]){
        VowRem ob = new VowRem();
        System.out.println("Enter the single line text");
        String g= new Scanner(System.in).nextLine();
        if(g.equals("")){
            System.out.println("INVALID INPUT");
            return;
        }
        ob.populate(g);
    }
}