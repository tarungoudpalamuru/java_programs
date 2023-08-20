class TestThrow3 extends Exception
{
    public TestThrow3(String str)
    {
        // Calling constructor of parent Exception
        super(str);
    }
    public static void main(String args[])
    {
        try
        {
            // throw an object of user defined exception
            throw new TestThrow3("This is user-defined exception");
        }
        catch (TestThrow3 ude)
        {
            System.out.println("Caught the exception");
            // Print the message from MyException object
            System.out.println(ude.getMessage());
        }
    }
}
// Class that uses above MyException
