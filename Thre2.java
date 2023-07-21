import java.util.*;
class Thre1 extends Thread {
    public void run(){
        for(int i=1;i<=3;i++)
        System.out.println(i);
    }
}
class Thre2{
    public static void main(String []args){
        Thre1 th=new Thre1();
        th.start();
        for(int i=7;i<=11;i++)
        System.out.println(i);
    }
    
}
