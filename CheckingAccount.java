public class CheckingAccount extends Account {

    double overdraftLimit = 1000;
    @Override
    public void withdraw(double amt) {
        if(amt<=getBalance()+overdraftLimit)
            super.withdraw(amt);
        else
            System.out.println("Overdraft limit exceeds.");
    }
    
}