 
 import java.util.*;
 import java.lang.*; 
 public class St {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        int i,c=0;
        for(i=0;i<ch.length-2;i++){
if(ch[i]=='0'&& ch[i+1]=='1' && ch[i+2]=='0'){
        ch[i+2]=ch[i+1];
        c=c+1;
}
        }     
    System.out.println(c);      
    }
    
}
