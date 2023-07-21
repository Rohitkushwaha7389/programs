import java.util.*;
public class Vowel {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name =sc.nextLine();

        char[] ch = name.toCharArray();
        int n = ch.length;

        char[] vowels = new char[n];
        int m = 0;

        for(int i=0; i<n; i++) {
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i'||ch[i]=='o' ||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') {

                vowels[m++] = ch[i];
                
            }
        }
        
    }        
}