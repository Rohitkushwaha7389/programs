import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
class Allmethod{
    public static void main(String []args){
       // Scanner sc=new Scanner(System.in);
        String s="rohit";
        char ch=s.charAt(4);
        System.out.println(ch);
     System.out.println("\n");
    //codePointAt
    String sc="rohit";
    int t=sc.codePointAt(2);
    System.out.println(t);
    System.out.println("\n");
    //codePointBefore
    String str="rohit kushwaha";
    int in=str.codePointBefore(3);
    System.out.println(in);
    System.out.println("\n");
    //codePOintCount
    String e="rohit";
    int i=e.codePointCount(2,3);
    System.out.println(i);
    System.out.println("\n");
    //compareTo
    String sb="Rohit kushwaha";
    String sb1="Rohit";
    System.out.println(sb.compareTo(sb1));
}
}