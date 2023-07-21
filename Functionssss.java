import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class Functionssss {
    int sum=0;
  public  int addtwoInt(int a,int b){
    sum=a+b;
    return sum;
  }
}
  class GFC{
    public static void main(String []args){
        Functionssss add=new Functionssss();
        int s=add.addtwoInt(1,2);
    
    System.out.println(s);
    
    }
}


    

