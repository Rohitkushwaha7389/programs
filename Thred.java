import java.util.*;
class Thred1 extends Thread {
    public void run(){
        for(int i=1;i<=3;i++)
        System.out.println(i);
    }
    
}
class Thred{
    public static void main(String []args){
        Thred1 th=new Thred1();
        th.start();
        for(int i=7;i<=11;i++)
        System.out.println(i);
    }
}

