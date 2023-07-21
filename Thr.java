class Thr1 implements Runnable {
   public   void run(){
    for(int i=1;i<=3;i++)
    System.out.println(i);
   }

    
}
class  Thr{
    public static void main(String []args){
        Thr1 thr=new Thr1();
Thread t=new Thread(thr);
for(int i=7;i<=11;i++)
      System.out.println(i);
    }
}
