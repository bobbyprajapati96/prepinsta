public class seclargest {
    public static void main(String[] args) {
     int arr[]={3,4,2,5,6,8,9};
     int lar=Integer.MIN_VALUE;
     int seclar=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]>=lar)
         {
             seclar=lar;
             lar=arr[i];
         }
         if(arr[i]!=lar && seclar<arr[i])
             seclar=arr[i];
     }
        System.out.println(seclar);
    }
}
