package innerclasses;

public class Outerclass {
    private int data=10;
      class Innerclass{
        public void msg()
        {
            System.out.println("inner class "+data);
        }
    }

    public static void main(String[] args) {
        Outerclass outer =new Outerclass();
        Outerclass.Innerclass inner =outer.new Innerclass();
        inner.msg();
    }


}
