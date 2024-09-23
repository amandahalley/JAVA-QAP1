package Problem1;
public class TestAccount {
    public static void main(String[] args) {
        
        //Two Accounts
        Account acc1 = new Account("Debit", "John Doe", 5000);
        Account acc2 = new Account("Credit", "John Doe", 4000);

        //Display initial balance of accounts
        System.out.println("\nInitial Account Balance: ");
        System.out.println("Account owner: " + acc1.getName());
        System.out.println("Debit balance: $" + acc1.getBalance());
        System.out.println("Credit balance: $" + acc2.getBalance());


        //Transfer $1000 from account 1 to account 2.
        System.out.println("\nTranferring $1000 from " + acc1.getName() + "'s " + acc1.getID() + " account to " + acc2.getName() + "'s " + acc2.getID() + " account..");
        acc1.transferTo(acc2, 1000);



        //Display updated balance.
        System.out.println("\nUpdated Account Balance: ");
        System.out.println("Account owner: " + acc1.getName());
        System.out.println("Debit balance: $" + acc1.getBalance());
        System.out.println("Credit balance: $" + acc2.getBalance());

    }
}
