import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class Bitsneede {
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=x^y;
        int count=0;
        while(z !=0){
            z=z &(z-1);
            count++;
        }
        System.out.println(count);
    }

}
