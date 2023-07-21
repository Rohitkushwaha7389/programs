import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=0,sum=0,temp;
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(sum==temp){
            System.out.println("palindrom");
        }else
            System.out.println("not palindrome");
        }
    }
    

