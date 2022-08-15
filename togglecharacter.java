package perpInsta100.strings;

public class togglecharacter {
    public static void main(String[] args) {
        String s="TusHaR";
        String s2="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isLowerCase(c)){
                s2+=Character.toUpperCase(c);
            }
            else{
                s2+=Character.toLowerCase(c);
            }
        }
        System.out.println(s2);
    }
}
