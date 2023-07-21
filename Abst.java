abstract class X {
    abstract void small();

    }
    class Y extends X{
        public void small(){
            System.out.println("Rohit");
        }
        class Abst {
            public static void main(String [] args){
                Y y=new Y();
                y.small();
                System.out.println("hello");

            }

            

        }

        

        

    }

    

