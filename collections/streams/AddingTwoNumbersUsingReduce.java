package collections.streams;

import java.util.Arrays;
import java.util.List;

public class AddingTwoNumbersUsingReduce {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = integers.stream()
                .reduce(0, (a, b) -> {
                    System.out.println(a + b);
                    return a+b;
                });

        Integer sum1 = integers.stream()
                .mapToInt((a) ->a).sum();
        System.out.println(sum1);
    }
}
