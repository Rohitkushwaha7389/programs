public class Array_findElement {
    public static void main(String []args){
        int []arr={4,5,6,7,8,9};
        int index=-1;
        int i;int x=5;
        for(i=0;i<arr.length;i++){
            if(arr[i]==x)
            index= i;
        }
        System.out.println(index);

    }
    
}
