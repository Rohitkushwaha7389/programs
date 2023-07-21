import java.util.*;
import java.lang.*;
 class Car{
    Car(){

    
 int no_of_tire=4;
 String bodytype="plastic";
 }
 public static void reverseGear()
 {
    System.out.println("Revese Gear is Applied..."); }
    public static void switchOnHeadLight()
    {
System.out.println("Headlight Turned On...");

    }
 }
 class BMW extends Car{
    BMW(){
        String model1="x3";}
        public void topSpeed(){
            System.out.println("Top Speed of BMW 200 kmph");
        }
        }
        public class Gear{
            public static void main(String[]args){
                Car c=new Car();
                BMW b=new BMW();
                c.reverseGear();
                b.switchOnHeadLight();
                b.topSpeed();
            }
        }

            
        
    