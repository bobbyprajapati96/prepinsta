package string;

public class allsubset {
    public static void main(String[] args) {
        String s="KGM";
        int len=s.length();
        int temp=0;
        int count=0;
        String [] arr=new String[len*(len+1)/2];
        for(int i=0;i<len;i++)
        {
            for(int j=i;j<len;j++)
            {
                arr[temp++]=s.substring(i,j+1);//j+1 because last one exclusive but we want last one also
                count++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println(count);
    }
}
