package string;

public class anagram {
    public static boolean ana(String s1,String s2) {
        int arr[] = new int[256];
        for (int i=0; i < s1.length(); i++)
        {
            arr[s1.charAt(i)]++;
        }
        for (int i=0; i < s2.length(); i++)
        {
            arr[s2.charAt(i)]--;
        }
        for(int e:arr) {
            if (e != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="hello";
        String s2="ehllo";
        System.out.println(ana(s1,s2));
             }
}
