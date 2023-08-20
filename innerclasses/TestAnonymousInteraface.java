package innerclasses;

interface Person1{
    void eat();
}
public class TestAnonymousInteraface {
    public static void main(String[] args) {
        Person1 obj=new Person1(){
            public void eat()
            {
                System.out.println("interface anonymous class");
            }

    };
        obj.eat();
    }
}
