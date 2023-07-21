import java.lang.*;
//Thread using implemtation runnable interface
 class T2 implements Runnable {
    public void run(){
        for(int i=1;i<=3;i++)
        System.out.println(i);
    }

    
}
class T1{
    public static void main(String[]args){
        T2 t=new T2();
        Thread p=new Thread(t);
        p.start();
        for(int i=7;i<11;i++)
        System.out.println(i);
    }
}
