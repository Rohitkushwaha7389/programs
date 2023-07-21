
import java.util.Scanner;
public class Hcl{

  public static void main (String[]args)
  {            
    Scanner sc= new Scanner (System.in);
    int n = sc.nextInt ();
     int x=0,y=1;
    int s= 0, s1 = 0,i=0;
    int[] a = new int[n];
    for ( i = 0; i < n; i++)
        a[i] = sc.nextInt ();
        int b[]=new int[n];
        int j=0;
    for ( i = n - 1;i>=0; i--)
      b[j++]=a[i];
      s+=a[0];s1+=b[0];
      for(i=1;i<n;i++){
        if(s>s1){
         s+=a[i];
         x++;

             if(x+y==n-1){
              System.out.println(i-1);
            
          } 
        }
         else if(s<s1) { 
         s1+=b[i];
         y++;
              if(x+y==n-1){
              System.out.println(i-1);
          }
         }
         else System.out.println("not the found");
      }
    }
}