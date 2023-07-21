import java.util.*;
class Allmethods{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(s.toLowerCase());
       System.out.println(s1.toUpperCase()); 
       System.out.println(s.concat(s1));
       System.out.println(s.length());
       System.out.println(s2.isEmpty());
       System.out.println(s1.charAt(2));
       System.out.println(s.indexOf("e"));
       System.out.println(s1.equals(s));
       System.out.println(s1.replace('r','t'));

    }
}