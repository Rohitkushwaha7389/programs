import java.lang.*;
public class Sbuffer {
    public static void main(String []args){
        StringBuffer p1=new StringBuffer("kushwaha");
        StringBuffer p2=new StringBuffer("kushwaha");
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));

        System.out.println("  \n");
        /// bulider class
        
            StringBuilder p4=new StringBuilder("kushwaha");
            StringBuilder p5=new StringBuilder("kushwaha");
            System.out.println(p4==p5);
            System.out.println(p4.equals(p5));
        }
        
    }
    
