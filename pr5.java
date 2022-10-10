 class PR5 {
    public static void main(String[] args) {
        SavingAccount sac = new SavingAccount();
        sac.setBalance(1000);
        sac.withdraw(2000);

        CheckingAccount cac = new CheckingAccount();
        cac.setBalance(1000);
        cac.withdraw(1100);
        System.out.println("Balance = "+cac.getBalance());
    }
}