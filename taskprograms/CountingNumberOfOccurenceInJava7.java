package taskprograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CountingNumberOfOccurenceInJava7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (map.containsValue(list.get(i))) {
                int count = map.get(list.get(i));
                map.put(list.get(i), ++count);
            } else {
                map.put(1, list.get(i));
            }
        }
    }
}
