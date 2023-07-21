import java.util.*;
public class Profitloss {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int cp=sc.nextInt();
        int sp=sc.nextInt();
         int amount=0;
         if(cp>sp){
            amount=cp-sp;
            System.out.println("The loss is :" + amount);
         }else if(cp<sp){
            amount=sp-cp;
            System.out.println("the profit is :" +amount);

         }else{
            System.out.println("no profit no loss");
         }

    }
    
}
