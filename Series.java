import java.util.*;
public class Series { //1-2+3-4....n
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int ans=0;
        for(int i=0; i<=num;i++){
            if(num%2==0)
            ans-=i;
        
            else
                ans+=i;

            
            

        }
       System.out.println(ans);
    }
    
}
