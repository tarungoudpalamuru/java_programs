package taskprograms;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacterOccuranceInJava7 {
    public static void main(String[] args) {
        String str = "malayalam";
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i),++count);
            } else {
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(map);
    }
}
