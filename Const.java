
import java.util.*;
class Rohit { int sum ;
  Rohit(){
    System.out.println("A");
}
   Rohit (int s){ this();
    sum =s;
System.out.println("B");}
 public void kam(){
    System.out.println("@kmlsh"+ sum);
 }
    }
    class Mayank extends Rohit {

        Mayank(){
        System.out.println("c");
       }
        Mayank(int n){ this();
        System.out.println("D");
       }
       public void roh(){
        System.out.println("@roht");
     }
    
       }
    

public class Const{
        public static void main(String []args){
           Mayank m=new Mayank();
           m.kam();
           m.roh();
    }
    }
