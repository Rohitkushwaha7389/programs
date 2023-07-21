 import java.util.*;
 class Thr2 extends Thread {
    public void run(){
        for(int i=1;i<=3; i++)
        System.out.println(i);
    }

}
class Thr1{
    public static void main(String[]args){
        Thr2 thr=new Thr2();
        thr.start();
        for(int i=7;i<11;i++)
        System.out.println(i);
    }

}