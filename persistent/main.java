package persistent;

import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class main {
    static void secsmallest(int arr[])
    {
        int lar=Integer.MIN_VALUE;
        int small=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>=lar)
            {
                small=lar;
                lar=arr[i];
            }
            if(arr[i]!=lar && small<arr[i]){
                small=arr[i];
            }
        }
        System.out.println(small);
    }

    static void smallest(int arr[])
    {
        int small=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=small)
            {
                small=arr[i];
            }
        }
        System.out.println(small);
    }
     static void reversearray(int arr[])
     {
         int mid=Math.floorDiv(arr.length,2);
          for(int i=0;i<=mid;i++)
          {
              int temp=arr[i];
              arr[i]=arr[arr.length-i-1];
              arr[arr.length-i-1]=temp;
          }
          for(int i:arr)
          {
              System.out.print(i+" ");
          }

     }
  static void sorthalf(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length/2;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int j=arr.length-1;j>=arr.length/2;j--)
        {
            System.out.print(arr[j]+" ");
        }
  }
    public static void swap(int arr[],int i,int j){
     int temp=arr[i];
      arr[i]=arr[j];
     arr[j]=temp;
    }
    static void sortarr(int arr[]){

//        boolean isswap=false;
//        for(int i=0;i<arr.length;i++) {
//           for(int j=0;j<arr.length-i-1;j++)
//           {
//               if(arr[j]>arr[j+1])
//               {
//                   isswap=true;
//                   swap(arr,j,j+1);
//               }
//               if(!isswap) break;
//           }
//        }

        //
        //insertion sort
        for(int i=1;i<arr.length;i++)
        {
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && curr<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        printarr(arr);
  }
  public static void printarr(int arr[]){
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
  }
  static void countdistinct(int arr[])
  {
      HashSet<Integer> hs=new HashSet<>();
      for(int i:arr)
      {
          hs.add(i);
      }
      System.out.println(hs.size());
  }
  static void repeatingele(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<arr.length;i++)
       {
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }
      System.out.println(map);
  }
    public static void main(String[] args) {
        int arr[]={23,5,4,4,4,6,6,7,8,9,2,1};
//        smallest(arr);
//       secsmallest(arr);
    //      reversearray(arr);
       // sorthalf(arr);
           //sortarr(arr);
        //countdistinct(arr);
        repeatingele(arr);
    }
}
