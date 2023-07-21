import java.util.Scanner;
import java.lang.*;
class Car
{public int no_of_tires;
public String bodyType;
    Car(){
  int no_of_tires = 4;
   String bodyType = "Plastic"; }
  public static void reverseGear()
  {
    System.out.println ("Reverse gare is Applied...");}
  public static void switchOnHeadLight ()
  {
    System.out.println ("Headlight turned on...");
} }
class BMW extends Car
{ public String model;
BMW(){
  String model = " X3"; }
  public void topSpeed ()
  {
    System.out.println ("TopSpeed of BMW is 200 kmph");
  }  }
public class Kam
{public static void main(String[]args)
  { BMW b = new BMW ();
      b.reverseGear();
      b.switchOnHeadLight ();
      b.topSpeed ();
  }
}