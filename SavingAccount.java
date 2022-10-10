public class SavingAccount extends Account{

    @Override
    public void withdraw(double amt) {
        if(amt>getBalance()){
            System.out.println("Not enough balance to withdraw.");
        }
        else{
            super.withdraw(amt);
        }
    }
 
}