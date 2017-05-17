package tasks.t_1;

/**
 * Created by sberber on 3/26/2017.
 */
public class Main {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(4);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println(saver1.show());
        System.out.println(saver2.show());
        SavingsAccount.modifyInterestRate(5);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println(saver1.show());
        System.out.println(saver2.show());

    }
}
