package string;

public class capitalizeFirst {
    public static void main(String[] args) {
        String s="tushar prajapati";
        char arr[]=s.toCharArray();
        boolean space=true;
        for(int i=0;i<arr.length;i++)
        {
            if(Character.isLetter(arr[i])){
                if(space){
                    arr[i]=Character.toUpperCase(arr[i]);
                    space=false;
                }
            }
            else{
                space=true;
            }
        }
        s=String.valueOf(arr);
        System.out.println(s);
    }
}
