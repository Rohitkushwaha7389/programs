import java.util.Scanner;

public class CountChar{
    public static void main(String[] args) {
        int voble=0,constant=0,spaces=0,digit=0,spicialcharacter=0;
        Scanner sc=new Scanner(System.in);
      String  str=sc.nextLine();
      char[]ch=str.toCharArray();
   
      for(int i=0;i<ch.length;i++){
        if(ch[i]=='a'|| ch[i]=='e'||ch[i]=='i'|| ch[i]=='o'||ch[i]=='u'){
            voble++;
        }
        else if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z')){
            constant++;
        }
        else if(ch[i]>='0' && ch[i]<='9'){
            digit++;
        }
        else if(ch[i]==' '){
            spaces++;
        }
        else{
                spicialcharacter++;
            }
        }
        System.out.println("voble are "+voble);
        System.out.println("constant are"+constant);
        System.out.println("Digit are"+digit);
        System.out.println("spaces are"+spaces);
        System.out.println("spicialcharacter are"+ spicialcharacter);
      }

        
    }
