package taskprograms;

import java.util.Optional;

public class OptionalClassExample {
    public static void main(String[] args) {
        String[] name=new String[10];
        name[4]="tarun goud";
        Optional<String> optionalobject=Optional.ofNullable(name[4]);
        if(optionalobject.isPresent()){
            String lowercaseString = name[4].toUpperCase();
            System.out.println(lowercaseString);
        }
        else {
            System.out.println("not present");
        }
    }
}
