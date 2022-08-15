package perpInsta100.strings;

public class sumOfDigits {
    public static void main(String[] args) {
        String s="Tushar3214";
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                sum+=c - '0';
            }
        }
        System.out.println(sum);
    }
}
