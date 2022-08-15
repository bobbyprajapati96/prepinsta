package perpInsta100.strings;

public class removeexceptAlpha {
    static void removeSpecial(String s){
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)<'A'||s.charAt(i)>'Z' && s.charAt(i)<'a' || s.charAt(i)>'z'){
                s=s.substring(0,i)+s.substring(i+1);
                i--;
            }
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        String s="tushar@123";
//        System.out.println(s.replaceAll("[^a-zA-Z]",""));
        removeSpecial(s);
    }
}
