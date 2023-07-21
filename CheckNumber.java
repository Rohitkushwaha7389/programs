import java.util.Scanner;

public class CheckNumber {

    static void checkNumber(int num){
        if(num>0)
                System.out.println("positive number: " +num);
        else if(num<0)
                     System.out.println("negetive no: "+num );
       else
               System.out.println("zero :"+num);
    }
public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int no=sc.nextInt();
            checkNumber(no);
        
    }
}