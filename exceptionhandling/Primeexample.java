package exceptionhandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Primeexample {
    public void prime(int n, int m) {

        for (int j = n; j <= (m); j++) {
            int count = 0;
            for (int i = 1; i <= Math.sqrt(m); i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(j );
            }

        }
    }
    public void stringexample(){
        StringBuffer str=new StringBuffer("abcdefghijklmnopqrstuvwxyz");
        System.out.println(str.reverse());

    }
    public void palindromeExample(StringBuffer n) {
        StringBuffer str=new StringBuffer(n);
        if ((str.reverse())==n) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
    public void combiningArrays(int a[],int b[]){
        int len=a.length+b.length;
        int c[] =new int[len],i=0;
        for(;i<a.length;i++){
            c[i]=a[i];
            }
        for(int j=0;j<b.length;i++,j++){
            c[i]=b[j];
        }
        for(int j:c){
            System.out.println(j);
        }
    }
    public void combiningTwoArraysUsingArrayList(ArrayList<Integer> al1,ArrayList<Integer> al2){
        al1.addAll(al2);
        System.out.println(al1);
        }


        public static void main (String [] args){
            Primeexample obj = new Primeexample();
//            obj.prime(1, 100);
//            obj.stringexample();
//            StringBuffer n=new StringBuffer("151");
//            obj.palindromeExample(n);
//              obj.combiningArrays(new int []{1,2,3},new int []{4,56,78});
            ArrayList<Integer> al=new ArrayList<>();
        /*    al.add(12);   al.add(12222);   al.add(122222222);   al.add(1222222);   al.add(122);
            al.add(122); al.add(122); al.add(122);
            System.out.println(al);*/
            Scanner sc=new Scanner(System.in);
            int noOfElementsinal1= sc.nextInt();
            int noOfElementsinal2= sc.nextInt();

            for(int i=0;i<noOfElementsinal1;i++){
                System.out.println("enter elements");
                int j=sc.nextInt();
                Integer k=j;
                al.add(k);
            }
            ArrayList<Integer> al2=new ArrayList<>(5);

            for(int i=0;i<noOfElementsinal2;i++){
                System.out.println("enter elements");
                int j=sc.nextInt();
                Integer k=j;
                al2.add(k);
            }

                obj.combiningTwoArraysUsingArrayList(al,al2);
        }
    }

