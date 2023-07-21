import java.util.*;
public class RemoveDuplicate {
    public static String DuplicateRemove(char[]str, int length){
        int index=0;
        int i;
         int j;
        for( i=0;i<length;i++){
            
          for( j=0;j<i;j++)  {
            if(str[i]==str[j]){
                break;
            }

            }
        
        if(j==i){
       str[index++]=str[i];
        }
    }
    System.out.println(String.valueOf(Arrays.copyOf(str,index)));
    return null;
    } 
    public static void main(String[] args) {
        String abs="rohitr";
        char[]str=abs.toCharArray();
        int len=str.length;
        DuplicateRemove(str,len);
        
    
}
}
