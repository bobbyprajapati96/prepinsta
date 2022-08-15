package perpInsta100.strings;

public class removeBrackets {
    public static void main(String[] args) {
        String s="[(a+b)=c]";
        System.out.println(s.replaceAll("[{}()]",""));
    }
}
