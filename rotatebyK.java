public class rotatebyK {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=3;
        System.out.println("Before");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        for(int i=0;i<k;i++)
        {
            int j,first;
            first=arr[0];
            for( j=0;j<arr.length-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
        System.out.println("after");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
