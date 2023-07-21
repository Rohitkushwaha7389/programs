import java.util.*;
public class hcf {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int num1=sc.nextInt();
        System.out.println("enter the first number:");
        int num2=sc.nextInt();
        System.out.println("enter the second number:");
        int hcf=0;
        for(int i=1; i<=num1||i<=num2;i++){
            if(num1%i==0 && num2%i==0)
            hcf=0;
        }
        System.out.println("hcf given two numbers is:"+hcf);

    }
    
}
