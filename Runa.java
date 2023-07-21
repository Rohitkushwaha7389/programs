import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
class X implements Runnable{
    public void run(){
    for(int i=1;i<=3;i++)
    System.out.println(i);
    }
}
class Runa{
    public static void main(String []args){
        X x1=new X();
        Thread t=new Thread (x1);
          t.start();
          for(int i=7;i<=11;i++)
          System.out.println(i);
    }
}
