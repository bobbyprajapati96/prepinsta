package perpInsta100.strings;

import java.util.HashMap;
import java.util.Map;

public class calculateFrq {
    public static void main(String[] args) {
        String s="tushar prajapati";
        int[] fre=new int[s.length()];
        int i,j;
        char []arr=s.toCharArray();
        for( i=0;i<s.length();i++)
        {
           fre[i]=1;
            for(j=i+1;j<s.length();j++)
            {
                if(arr[i]==arr[j]){
                    fre[i]++;
                    arr[j]='0';
                }
            }
        }
        for(i = 0; i <fre.length; i++) {
            if(arr[i] != ' ' && arr[i] != '0')
                System.out.println(arr[i] + "-" + fre[i]);
        }
    }


}

