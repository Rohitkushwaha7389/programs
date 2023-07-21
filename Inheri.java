class X {
    void n(){
        System.out.println("hii");
    }
    
}
class Y extends X{
    void n(){
        System.out.println("hello");
    }
}
class Inheri{
    public static  void main(String []args){
    Y y=new Y();
    y.n();
    }
}
