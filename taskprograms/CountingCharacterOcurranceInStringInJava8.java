package taskprograms;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingCharacterOcurranceInStringInJava8 {
    public static void main(String[] args) {
        String str="tarun goud";
//        String str1=str.replace(" ","");
//        System.out.println(str1);
        Map<Character,Long> map= str.replaceAll(" ","").chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(character->character, Collectors.counting()));
        System.out.println(map);
    }
}
