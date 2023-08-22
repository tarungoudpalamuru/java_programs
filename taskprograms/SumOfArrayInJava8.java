package taskprograms;

import java.util.Arrays;

public class SumOfArrayInJava8 {
    public static void main(String[] args) {
        int [] arr={2,3,4,5,1};
        System.out.println("using Arrays.stream(arr).sum()\t"+Arrays.stream(arr).sum());
        System.out.println("using Arrays.stream(arr).reduce(0,(x,y)->x+y)\t"+Arrays.stream(arr).reduce(0,(x,y)->x+y));
    }
}
