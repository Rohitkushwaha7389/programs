
import java.util.ArrayList;

public class Replace {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(12);
        num.add(18);
        num.add(22);
        num.add(6);
        num.add(8);
        num.add(9);
       int p=1;
        
        // System.out.println(num); 
        // for (int i = 0; i < num.size(); i++) {
        //     if (num.get(i) % 2 == 0) {
        //         num.set(i, -1);
        //     }

        // }
        // System.out.println(num);
        for(int i=0;i<num.size()-1;i++){
            if(num.get(i)>num.get(i+1));
            p=i+1;

        }
        System.out.println(p);
    }

}
