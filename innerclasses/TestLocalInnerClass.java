package innerclasses;



public class TestLocalInnerClass {
    public void  outerMethod(){
        class InnerLocalClass{
            public void innerMethod(){
                System.out.println("innermethod");
            }

        }


        InnerLocalClass inr=new InnerLocalClass();
        inr.innerMethod();
        System.out.println("outer method");

    }

    public static void main(String[] args) {
        TestLocalInnerClass outer=new TestLocalInnerClass();
        outer.outerMethod();


    }
}

