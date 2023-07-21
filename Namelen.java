import java.util.*;
public class Namelen{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
String name=s.nextLine();
char []arr= name.toCharArray();
int count=0;
for(char c: arr){
    ++count;
}

System.out.println(count);


}
}

