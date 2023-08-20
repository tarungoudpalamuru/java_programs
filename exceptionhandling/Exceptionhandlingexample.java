package exceptionhandling;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class Exceptionhandlingexample {
    public void testarithmeticexception(int x,int y) {
        try {
            System.out.println(x / y);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }
    }
        public void testArrayindexoutofboundsexception(int arr []){
            try{
                System.out.println(arr[6]);
            }
            catch(ArrayIndexOutOfBoundsException aioobe){
                System.out.println(aioobe);
        }
    }
    public void testNullpointerexception(String str){
        try{
            str.length();
        }
        catch(NullPointerException npe){
            System.out.println(npe);
        }
    }
    public void testNumberformatexception(String str){
        try{
            int i=Integer.parseInt(str);
        }
        catch(NumberFormatException nfe){
            System.out.println(nfe);
        }
    }
    public void testFilenotfoudnexception(String str){
        try{
            FileReader file=new FileReader(str);
        }
        catch(FileNotFoundException fnfe){
            System.out.println(fnfe);
        }
    }

    public static void main(String[] args) {
        Exceptionhandlingexample obj=new Exceptionhandlingexample();
        obj.testarithmeticexception(100,0);
        obj.testArrayindexoutofboundsexception(new int[]{1, 2, 3, 4, 5});
        obj.testNullpointerexception(null);
        obj.testNumberformatexception("tarun");
        obj.testFilenotfoudnexception("temp.txt");

    }
}
