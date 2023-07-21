class X {
X(){
    //multi constractor
    this(5);
    System.out.println("hi");

} 
public X(int n){
    System.out.println("hello");
}   
}
class Multic{
    public static void main(String [] args){
        X x=new X();

    }
}
