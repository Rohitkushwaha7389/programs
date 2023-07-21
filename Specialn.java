import java.util.*;

public class Specialn {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='0' && ch[i]<='9'|| ch[i]>='a' && ch[i]<='z'|| ch[i]>='A' && ch[i]<='Z'){
            continue;
        }
        else 
        count++;}
        System.out.println(count);

    }
    
}
