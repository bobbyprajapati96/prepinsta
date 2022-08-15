package perpInsta100.strings;

import java.util.Locale;

public class capitalizeFirstandLast {
    public static void main(String[] args) {
        String s="tushar prajapati";
        String s3="";
        String c[]=s.split(" ");
//        for(int i=0;i<c.length;i++)
//        {
//            String firstchar=c[i].substring(0,1);
//            String restchar=c[i].substring(1,c[i].length()-1);
//            String lastchar=Character.toString(c[i].charAt(c[i].length()-1));
//            s3+=firstchar.toUpperCase()+restchar+lastchar+" ";
//            System.out.println(s3);
//        }
        for(String str:c ){
            String firstchar=str.substring(0,1);
            String restchar=str.substring(1,str.length()-1);
            String lastchar=Character.toString(str.charAt(str.length()-1));
            s3+=firstchar.toUpperCase()+restchar+lastchar.toUpperCase()+" ";
            System.out.println(s3);
        }
    }
}
