package perpInsta100.strings;

public class alphabetORnot {
    public static void main(String[] args) {
        char c='2';
        if(c>='a' && c<='z' || c>='A' && c<='Z'){
            System.out.println(c+" is alphabet");
        }
        else{
            System.out.println("Not an alphabet");
        }
    }
}
