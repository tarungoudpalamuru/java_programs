package taskprograms;

public class MaxNumberInArrayInJava7 {
    public static void main(String[] args) {
        int array1[] ={4,5,3,2,5,3,5,87,33};
        int max=array1[0];
        for(int i=1;i<array1.length;i++){
            if(max<array1[i])
                max=array1[i];
        }
        System.out.println("using java7 max value="+max);
    }
}
