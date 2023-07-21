interface  Rohit {
    void fast(String name);
}
    class Mayank  implements Rohit{
        public void fast(String name){
            System.out.println("programming language:" +name);
        }

    }
    class Interf{
        public static void main(String[]args){
            Mayank  m=new Mayank();
            m.fast("java");
        }
    }

