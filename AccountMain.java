import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Account[] objects = new Account[10];

        for (int i = 0; i < objects.length; i++) {
            objects[i] = new Account(i, 100);
        }
        Simulate(objects);
    }

    public static void Simulate(Account[] array) {
        boolean flag = true;
        int eid;
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Id : ");
        eid = sc.nextInt();

        while (flag) {
            if (eid < 10 && eid >= 0) {
                System.out.println("****Menu****");
                System.out.println(" 1.View Balance");
                System.out.println(" 2.Withdraw money");
                System.out.println(" 3.Deposit money");
                System.out.println(" 4.Main Menu");
                System.out.println("99.Exit");
                System.out.print("Make a choice : ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Balance  = " + array[eid].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter Amount to withdraw : ");
                        int amt = sc.nextInt();
                        array[eid].withdraw(amt);
                        System.out.println("Remaining Balance  = " + array[eid].getBalance());
                        break;
                    case 3:
                        System.out.print("Enter Amount to deposit : ");
                        amt = sc.nextInt();
                        array[eid].deposit(amt);
                        System.out.println("Balance  = " + array[eid].getBalance());
                        break;
                    case 4:
                        Simulate(array);
                        break;
                    case 99:
                        flag = false;
                        break;
                    default:
                        System.out.println("Make a valid choice");
                }
            }
            else{
                System.out.println("Invalid ID");
                flag = false;
            }
        }
        sc.close();
    }
}