package tasks.t_1;

public class SavingsAccount {
    static float annualInterestRate;
    private float savingsBalance;

    SavingsAccount(float balance){
        savingsBalance = balance;

    }

    public void calculateMonthlyInterest(){
        savingsBalance+= (savingsBalance* annualInterestRate)/12;
    }
    static void modifyInterestRate(float val){
        annualInterestRate = val;
    }

    public float show(){
        return savingsBalance;
    }

}
