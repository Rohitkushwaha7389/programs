import java.util.*;
public class TelingProblem {
   public static int CountWays(int n){
    if(n<=3){
        return n;
    }
    return CountWays(n-1)+CountWays(n-2);
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(CountWays(n));
        
    }
    
}
