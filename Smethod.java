import java.lang.*;
import java.util.*;
public class Smethod {
    //1 split
    public static void main(String [] args){
         String name= new  String("rohit kushwaha");
         String[] d =name.split(" ");
         for(String h: d)
         System.out.println(h+" ");
         System.out.println("\n");
//2 charAt
  String s ="rohit";
  char ch=s.charAt(3);
  System.out.println(ch);
  System.out.println(" \n");
// 3 codePointAt
String e="rohit";
int t=e.codePointAt(1);
System.out.println(t);
System.out.println("\n");
// 4 codePointbefor 
 String a="rohit";
 int ro=a.codePointBefore(3);
 System.out.println(ro);
 System.out.println("\n");
 //5 codePointCount
 String b="Rohit kushwaha";
 int m=b.codePointCount(1,3);
 System.out.println(m);
 System.out.println("\n");
 //6 compareTo
 String sb="Rohit kushwaha";
 String sb1="Rohit";
 System.out.println(sb.compareTo (sb1));
 System.out.println("\n");
 //7 compareToIgnorecase
 String rh="Rohit kushwaha";
 String rh1="Rohit";
 System.out.println(rh.compareToIgnoreCase(rh1));
 System.out.println("\n");
 //8 concat
 String sr="Rohit";
  sr=sr.concat(" kushwaha");
  System.out.println(sr);
  System.out.println("\n");
  //9 contains
  String sp="Rohit";
boolean be=sp.contains("kushwaha");
System.out.println(be);
System.out.println("\n");
//10 contentEquals
String sd="Rohit";
String sd1="kushwaha";
StringBuffer sd2 =new StringBuffer("kushwaha");
boolean re=sd.contentEquals(sd2);
System.out.println(re); 
boolean r=sd1.contentEquals(sd2);
System.out.println(r);
System.out.println("\n");
//replaceAll
String st="Rohit123kushwaha";
String regex="\\d+";   
//mid se number delete karna regex
System.out.println(st.replaceAll(regex," "));
    }
  }