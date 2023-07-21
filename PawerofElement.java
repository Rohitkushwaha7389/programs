import java.util.*;
public class PawerofElement {
    /**
     * @param a
     * @param b
     * @return
     */
    public static int powerofelement(int a,int b){
        int result=0;
     int  fresult=0;
      if(b==1){
        return a;
      }
      else{
        result=powerofelement(a,b/2);
        fresult=result*result;
      
         if(b%2==0){
        return fresult;
         }
         else{
            return fresult*a;
        }
    }
}
      

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       int fresult=powerofelement(a,b);
        System.out.println(fresult);
    }
    
}
