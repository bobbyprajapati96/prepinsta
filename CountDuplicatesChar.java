package string;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicatesChar {
    public static void main(String[] args) {
        String s="Tuushaar";
        char arr[]=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char e:arr)
        {
            map.put(e,map.getOrDefault(e,0)+1);

        }
        System.out.println(map);
        for(Map.Entry<Character,Integer> m: map.entrySet()){
            System.out.println(m.getKey()+" -> "+m.getValue());
        }
    }
}
