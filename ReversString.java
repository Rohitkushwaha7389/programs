 public class ReversString {
    public static void main(String[] args) {
    String str1="rohit";
  StringBuffer str2= new StringBuffer(str1);
//         String str2=" ";
//         char ch;
//         for(int i=0;i<str1.length();i++){
//             ch=str1.charAt(i);
//             str2=ch+str2;

//         }
//         System.out.println(str2);
           str2.reverse();
        System.out.println(str2);
    }
     }
