import java.util.*;
public class Factorial{
     public  static int factorialNum(int num){
        int result=0;
             if(num==0 || num==1){
                return 1;
             }
            else{
                result=num*factorialNum(num-1);
                return result;
            }
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=factorialNum(num);
     
        System.out.println(result);
    }
}