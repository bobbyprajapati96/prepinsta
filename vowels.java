package perpInsta100.strings;
class vomels{
static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        return true;
        else if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
        return true;
        else
        return false;
        }
public static void main(String[] args) {
        String s="tushar";
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
        char c=s.charAt(i);
        if(isVowel(c)){
        System.out.println(c+" is vowel");
        }
        else
        System.out.println(c+" is consonant");
        }

        }
}

