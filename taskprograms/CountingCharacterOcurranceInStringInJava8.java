package taskprograms;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingCharacterOcurranceInStringInJava8 {
    public static void main(String[] args) {
        String str="afhfafjhuahbb";
        Map<Character,Long> map= str.chars()
                .mapToObj(c->(char)c).collect(Collectors.groupingBy(character->character,LinkedHashMap :: new, Collectors.counting()));
        System.out.println(map);
    }

}
