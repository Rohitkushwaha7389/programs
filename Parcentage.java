import java.util.*;
public class Parcentage {
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int mark1=sc.nextInt();
        int mark2=sc.nextInt();
        int mark3=sc.nextInt();
        int total=mark1+mark2+mark3;
        int parcen=(total/3);
        System.out.println(total);
        System.out.println(parcen);
    }

}