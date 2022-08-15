package persistent;

public class largestele {
    public static void main(String[] args) {
        int arr[]={2,3,5,6,11,9,10};
        int lar=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>=lar)
                lar=arr[i];
        }
        System.out.println(lar);
    }
}
