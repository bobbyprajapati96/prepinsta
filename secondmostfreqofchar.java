package string;

public class secondmostfreqofchar {
      static char getSecondMostFreq(String s){
          int[] count=new int[256];
          for(int i=0;i<s.length();i++)
          {
              (count[s.charAt(i)])++;
          }
          int first=0,second=0;
          for(int i=0;i<256;i++)
          {
             if(count[i]>count[first]) {
                 second=first;
                 first=i;
             }else if(count[i]>count[second] && count[i]!=count[first]){
                 second=i;
             }
          }
          return (char)second;
      }

        public static void main(String args[])
        {
            String str = "geeksforgeeks";
            char res = getSecondMostFreq(str);
            if (res != '\0')
                System.out.println("Second most frequent char"+
                        " is " + res);
            else
                System.out.println("No second most frequent"+
                        "character");
        }
    }


