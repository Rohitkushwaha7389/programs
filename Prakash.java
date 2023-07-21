 class Ram {
    int a,b;
    Ram(){
        a=5;
    //  a=b=2;
        System.out.println(a);
    }
    Ram (int a,int m){
        this();
      //  a=a;
      //  b=m;
       
        System.out.println("a");
    }
    public void roh(){
        System.out.println(" @ram");
    }
    }
    
       class Ramesh extends Ram{
        int c,d;
        Ramesh(){
            c=3;
        
            System.out.println(c);
        }
            Ramesh(int g,int k){
                 this();
                 System.out.println("p");
            }
                 public void kam(){
                    System.out.println("ram");
                 }

            }
        
    
    class Prakash{
        public static void main(String[]args){
       Ramesh r=new Ramesh();
       r.kam();
       r.roh();
    }

       }


    
    
    

    

