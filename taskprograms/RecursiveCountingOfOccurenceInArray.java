package taskprograms;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class RecursiveCountingOfOccurenceInArray {
    static int index=0;
    static int count=0;
    public static int  countOcurrence(int array[],int n){
        if(array.length==0){
            return count;
        }
        if(array.length==index){
            return count;
        }
        if (array[index]==n) {
            ++count;
        }
            ++index;
            countOcurrence(array,n);
        return count;
    }
    public static void main(String[] args) {
        int arr[]={3,2,3,3,1,2,2,1};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter element to search");
        int n=sc.nextInt();
        System.out.println(countOcurrence(arr,n));

    }
}
