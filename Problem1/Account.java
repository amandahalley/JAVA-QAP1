package Problem1;
public class Account {
    private String id;
    private String name;
    private int balance = 0;


    //constructor - id and name
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //constructor - id, name, and balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //getters
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }


    // Credit - add amount to balance
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    //debit - subtract amount from balance
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance.");
        }
        return balance;
    }

    //transfer - transfer amount to another account if possible
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount); //subtracts from this account
            another.credit(amount); //add to other account
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;

    }

    //ToString method 
    public String toString() {
        return "Account[id =]" + id + ", name =" + name +  ", balance = " + balance + "]";
    }
}


