package innerclasses;
abstract class Person{
    abstract void eat();
}
 public class TestAnonymous {
     public static void main(String[] args) {
         Person p=new Person(){
             void eat()
             {
                 System.out.println("anonymous class eat method");
             }

         };
         p.eat();
     }
}
