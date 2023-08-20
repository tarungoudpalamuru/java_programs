package Mypack;
import java.util.*;

public class Details {
    public static String surname="palamuru";
    public static String firstname="tarun";
    public Details()
    {
        System.out.println(surname+firstname);
    }
    public Details(String surname,String firstname) {
        System.out.println("full name:"+this.surname+firstname);
    }

    public void fullnames(String name)
    {
        String [] words=name.split("\\s");
        List<String> index=Arrays.asList(words);
        Collections.sort(index);
        System.out.println(index);

    }

}
