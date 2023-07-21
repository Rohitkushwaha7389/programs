import java.util.*;
public class Sssort {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        String name=sc.nextLine();
        char[] ch=name.toCharArray();
        Arrays.sort(ch);
        String h= new String(ch);
        System.out.println(h);
    }
    
}
