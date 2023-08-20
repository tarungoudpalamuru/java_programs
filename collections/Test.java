package collections;

import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5,11,12,13,14};
        int[] array2 = {6, 7, 8, 9, 10};

        int[] mergedArray = IntStream.concat(IntStream.of(array1), IntStream.of(array2)).toArray();

        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

}
