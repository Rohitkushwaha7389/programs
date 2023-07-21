import java.util.*;
public class Sum_of_digit {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num >0){
            sum =sum+(num%10);
            num /=10;
        }
        System.out.println(sum);
    }
    
}
