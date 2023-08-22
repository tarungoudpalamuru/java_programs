package taskprograms;


import java.util.Arrays;

public class MaxNumberInArrayInJava8 {
    public static void main(String[] args) {
        int array1[] ={4,5,3,2,5,3,5,87,33};
        System.out.println("using java 8  Arrays.stream(array1).max().getAsInt()\t"+
                Arrays.stream(array1).max().getAsInt());
        System.out.println("using Arrays.stream(array1).reduce(0,(x,y)->x>y?x:y\t"+
                Arrays.stream(array1).reduce(0,(x,y)->x>y?x:y));
        System.out.println("Arrays.stream(array1).reduce(Integer.MIN_VALUE,Integer::max)"+
                Arrays.stream(array1).reduce(Integer.MIN_VALUE,Integer::max));


    }
}
