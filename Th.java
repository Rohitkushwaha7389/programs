class Th1 extends Thread {
  public  void run(){
        for(int  i=1 ;i<=3 ;i++)
       System.out.println(i);
    }
    
}
class Th{
    public static void main(String []args){
Th1 th=new Th1();
    th.start();
    for(int i=7;i<=11;i++){
        System.out.println(i);
    }
    }
}
