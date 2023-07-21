import java.util.*;
import java.lang.*;
public class Enter {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=s.toLowerCase();

        if(!check(s1)){
            System.out.println("false");}
        else
        System.out.println("kushwaha");
        }
        
        public static boolean check(String c){
        String k="kamleh";
        String r="Rohit";
        String m="mayank";
        String v="vineet";
        boolean b=false;
        if(b=r.equals(c))
        return true;
        else if(b=k.equals(c))
        return true;
        else if(b=m.equals(c))
        return true;
        else if(b=v.equals(c))
        return true;
        else 
        return false;
    }


}

