class Move_Zeros{
    public static void main(String[] args){
        int arr[]={0,1,0,3,12};

        int min=arr[0]; int j=arr.length-1;   int i;
       
        for(i=0; i<arr.length; i++){
    {
          if (arr[i]==0 && i<j){
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
               j--;
          }
         }  
        } for(int k:arr)
        System.out.print(k +" ");
    }
}