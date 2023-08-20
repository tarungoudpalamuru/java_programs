// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code
/**
 * The HelloWorld program implements an application that
 * simply displays "Hello World!" to the standard output.
 *
 * @author  tarun
 * @version 1.0
 * @since   2023-07-19
 */
import Mypack.Details;
import Mypack.Employee;
import Mypack.Exceptionexample;
import Mypack.MinimumBalanceException;
//import java.lang.*;
import java.sql.ResultSet;
import java.net.http.HttpClient;
import java.lang.Exception;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //static int num=10;
    public static void main(String[] args) {
//        // Press Alt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");
//        int num=9_10_23;
//        System.out.println(num);
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//        String str="diebold";
//        System.out.println("i = "+Integer.valueOf(args[0]));
//        Details one=new Details("sai","a");
//        one.fullnames("ajfhslhf alkfhsfsa  sjsfhkshf shfs");
//        System.out.format(str);
//        Date today=new Date();
//        System.out.println(today);
//        Random temp=new Random();
//        System.out.println(temp);
//        Car bmw=new Car("bmw","x3","white",30000);
//        bmw.setColor("red");
//        System.out.println(bmw.getColor());
//        Container myobj=new Container();
//        System.out.println(Container.cookietype);
//        myobj.temp();

// 100/0
        //aray = {1,2,3,4,5} lenth = 7
        // io exception
        // nullpointer
        //numberFormat exception parseInt-->

        //Book obj1=new Book(5);
        //Selfhelpbook obj2=new Selfhelpbook(9);
//        System.out.println(Book.class.getClassLoader());
//        System.out.println(ResultSet.class.getClassLoader());
//        System.out.println(HttpClient.class.getClassLoader());
//        SportsUtility discovery = new LandRover("Land Rover Discovery",  6);
       // System.out.println(discovery.getMessage());

//        try {
//            int[] arr = {1, 2, 3};
//            obj5.arrayDemo(arr);
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//        finally{
//            System.out.println("reached finally block");
//        }
        Employee s=new Employee(10000);
//        try{
//            s.withdraw(100000);
//        }
//        catch(MinimumBalanceException mbe){
//            System.out.println(mbe.getMessage());
//        }
        System.out.println("enter amount");
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        s.withdraw(amount);
    }
}