import java.util.Scanner;
import java.lang.*;
public class Rsn {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        char []arr=name.toCharArray();
        int l=arr.length;
      char p;
      p=arr[0];
      arr[0]=arr[l-1];
      arr[l-1]=p;
      for(int i=l-1;i>=0;i++)
      name =toString(arr);
      System.out.println(name);
    }
    public static String toString(char[] arr){
        String string=String.valueOf(arr);
        return string;
    }
}
