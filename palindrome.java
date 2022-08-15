package perpInsta100.strings;

public class palindrome {
    public static void main(String[] args) {
        String s="abs";
        String s2="";
        for(int i=s.length()-1;i>=0;i--){
            s2+=s.charAt(i);
        }
        if(s.equals(s2))
            System.out.println("string is Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
