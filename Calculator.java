import java.util.*;
public class Calculator {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        char op=sc.next().charAt(0);
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        double ans=0;
        switch(op){
            case '+':
            ans=num1+num2;
            System.out.println(ans);
            break;
            case'-':
            ans=num1-num2;
            System.out.println(ans);
            break;
            case'*':
            ans=num1*num2;
            System.out.println(ans);
            break;
            case'/':
            ans=num1/num2;
            System.out.println(ans);
            break;
            default:
            System.out.println("The operator is not correct");
        }
    }
    
}
