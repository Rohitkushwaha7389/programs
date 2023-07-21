import java.util.*;
public class Count_number {
    public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     int sum=0;
     int num=sc.nextInt();
     while(num>0){
        sum++;
        num/=10;
     }
     System.out.println(sum);


    }
    
}
