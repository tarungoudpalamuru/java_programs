package Mypack;

public class Employee {
    private int bal = 0;

    public Employee(int bal) {
        this.bal = bal;
    }

    public void withdraw(int amt) {
        try {

            if (bal >= 0 && amt <= bal) {
                System.out.println("You can withdraw amount " + amt);
            } else
                throw new MinimumBalanceException("Please maintain min balance in your account");

        } catch (MinimumBalanceException me) {
            System.out.println(me);
        }
        if (amt > bal) {
            System.out.println("Please maintain min balance ");
        }

    }
}

