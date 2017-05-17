package tasks.t_1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSavingsAccount {
    @Test
    public void T1(){
        SavingsAccount saver = new SavingsAccount(2000);
        SavingsAccount.modifyInterestRate(4);
        saver.calculateMonthlyInterest();
        assertEquals(saver.show(),2666.6667,0.2);
    }
}
