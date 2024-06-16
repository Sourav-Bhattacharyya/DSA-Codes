package Test_Codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IPL {
    IPL(){}
    void generate(List<String>l){
        List<String> g = new ArrayList<>();
        for(int i=0; ;i++){
            if(l.get(i).equals("Q"))
            break;
            for(int j=i+1; ;j++){
                if(l.get(j).equals("Q"))
                break;
                g.add(l.get(i)+"-VS-"+l.get(j));
            }
        }
        System.out.println("TOTAL MATCHES:"+g.size());
        for(String i:g)
        System.out.println(i);
    }
    public static void main(String args[]){
        IPL ob = new IPL();
        List<String> l = new ArrayList<>();
        String s="";
        do{
            s=new Scanner(System.in).nextLine();
            l.add(s);
        }while(!s.equals("Q"));
        ob.generate(l);
    }
}
