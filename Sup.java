import java.util.*;
class X{
    //super keywords use
    X(){
        System.out.println("hi");
    }
   public X(int n){
    System.out.println("hello");

   }
    
}
class Y extends  X{
    Y(){
        System.out.println("Rohit");
    }
public Y (int n){
    super(n);
    System.out.println("kam");
    
}
}
public class Sup{
    public static void main(String []args){
        Y y=new Y();
        Y y1=new Y(4);
    }
}
