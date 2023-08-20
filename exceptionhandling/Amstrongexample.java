package exceptionhandling;

import java.util.Scanner;

public class Amstrongexample {
    public static void amstrongNumberUsingJava8(int number){
        int numofdigits=String.valueOf(number).length();
        int sum=String.valueOf(number).chars()
                .map(Character::getNumericValue)
                .map(digit->(int)Math.pow(digit,numofdigits))
                .sum();
        if(sum==number)
            System.out.println("armstrong");
        else
            System.out.println("not arsmtrong");
    }
    public static void main(String[] args) {
        amstrongNumberUsingJava8(143);
//        int n,rem,sum=0,temp;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter n value");
//        n=sc.nextInt();
//        temp=n;
//        while(n>0){
//            rem=n%10;
//            sum= (int) (sum+Math.pow(rem,3));
//            n=n/10;
//        }
//        if(sum==temp){
//            System.out.println("armstrong");
//        }
//        else{
//            System.out.println("not armstrong");
//        }
    }
}
