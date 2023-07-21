import java.util.Scanner;
public class Compare {
    public static void main (String [] args){
        Scanner sc= new Scanner (System.in);
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        if(length==breadth){
            System.out.println("it is a square");
        }else{
            System.out.println("it is a not square");
        }
    }
    
}
