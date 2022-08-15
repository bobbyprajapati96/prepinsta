package perpInsta100.strings;

public class nonrepeatingChar {
    public static void main(String[] args) {
        String s="TusharPrajapati";
        boolean flag=true;
        for(char i:s.toCharArray()){
            if(s.indexOf(i)==s.lastIndexOf(i)){
                System.out.println("first non repeating char ->"+i);
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println("There is no non repeating character");
    }
}
