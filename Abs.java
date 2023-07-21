import java.lang.*;
  abstract class X {
   abstract void small();
}

 class Y extends X {
    public void small(){
      System.out.println("KAMLESH");

 }
}
 class Abs{
    public static void main(String []args){
  
        Y y=new Y();
          y.small();
          System.out.println("hi");

    }
 }
  