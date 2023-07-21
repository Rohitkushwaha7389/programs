
//buzz number
import java.util.*;
public class buzzno {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[50];
    int i,p=0;
  for(i=0;i<n;i++)
  a[i]=sc.nextInt();
  for(i=0;i<a[i];i++){
  if(a[i]%2==1)
  p=p+a[i];
  }
  if(buzz(p)==true
  )
  System.out.println("this is a buzz no");
  else 
  System.out.println("not a buzz no.");
}    
public static boolean buzz(int n){
    if(n%7==0||n%10==7)
    return true;
    else 
    return false;
}
}
