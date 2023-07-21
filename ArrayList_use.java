import java.util.*;
public class ArrayList_use {
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list1 =new ArrayList<String>();
        ArrayList<Boolean> list2 =new ArrayList<Boolean>();
        // add elements
        list.add(0);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(4);
        System.out.println(list);
        // get element
        int element= list.get(0);
        System.out.println(element);
        // add element in between
        list.add(1,2);
        // set element
        list.set(0,0);
        //element delete
        list.remove(0);
        System.out.println(list);
        // size of lists
        int size= list.size();
        System.out.println(size);
        //Loops on lists
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i) + " ");
        }
            // sorting the list
            list.add(0);
            Collections.sort(list);
            System.out.println(list);
        

    }
    
}
