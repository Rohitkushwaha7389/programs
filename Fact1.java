import java.util.Scanner;
class Fact
{ int num, f;
    Fact()
    {   f = 1;
    }
    Fact(int n)
    { this();
        num = n; }
    public long getFact()
    {   while(num!=0){
        f=f*num--; } 
        return f; }
}
 class Fact1{
    public static void main(String[] args)
    {     Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
        Fact f = new Fact();
        f= new Fact(m);
      System.out.println(f.getFact());  } 
}