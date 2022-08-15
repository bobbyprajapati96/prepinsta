public class fiibonacci {
    public static void main(String[] args) {
        int n=20;
        int first=0;
        int sec=1;
        for(int i=1;i<=n;i++) {
            System.out.println(first+" ");
            int thr = first + sec;
            first = sec;
            sec = thr;
        }
    }
}
