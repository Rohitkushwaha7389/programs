import java.util.*;
public class Fabonacii {
    public static int fib(int num){
        int result=0;
        if(num<=1){
            return num;
        }
        else{
            result= fib(num-1)+fib(num-2);
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
    int result=fib(num);

       System.out.println(result);
        
    }

    
}
