package Advanced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Sai", 17);
        map.put("Lattika", 12);
        map.put("Dhakshesh", 16);

        System.out.println(map);

        ArrayList<Character> char_list = new ArrayList<Character>();
        char_list.add('a');
        char_list.add('b');
        char_list.add('c');
        char_list.add('b');
        char_list.add('a');
        System.out.println(char_list);

        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

        for(int i = 0; i < char_list.size(); i++) {
            hmap.put(char_list.get(i), hmap.getOrDefault(char_list.get(i), 0) + 1);
            // if(hmap.get(char_list.get(i)) > 0) {
            //     hmap.put(char_list.get(i), hmap.get(char_list.get(i)) + 1);
            // } else {

            // }
        }
        System.out.println(hmap);

        for(Map.Entry<Character, Integer> entry : hmap.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            if(value == 1) {
                System.out.println("The unique character in the list is " + key);
            }
        }


    }
}