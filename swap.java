public class swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
         a=a^b;
         b=b^a;
         a=a^b;
        System.out.println(a+" "+b);

    }
}
