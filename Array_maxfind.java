public class Array_maxfind {
    public static void main(String []args){
        int arr[]={4,6,2,5,9,7};
        int ans=0;
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]>ans)
            ans=arr[i];
        }
    System.out.println(ans);

    }
    
}
