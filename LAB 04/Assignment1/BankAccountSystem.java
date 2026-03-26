
/* 
Create Person and Account Class as shown below in class diagram. Ensure
minimum balance of INR 500 in a bank account is available.

a) Create Account for smith with initial balance as INR 2000 and for Kathy with initial
balance as 3000(accNum should be auto generated).
b) Deposit 2000 INR to smith account.
c) Withdraw 2000 INR from Kathy account.
d) Display updated balances in both the account.
e) Extend the functionality through Inheritance and polymorphism. Inherit two classes
Savings Account and Current Account from account class. And Implement the following in
the respective classes.
- Savings Account
a. Add a variable called minimum Balance and assign final modifier.
b. Override method called withdraw (This method should check for minimum balance and
allow withdraw to happen)
- Current Account
a. Add a variable called overdraft Limit
b. Override method called withdraw (checks whether overdraft limit is reached and
returns a Boolean value accordingly)

*/

class Person{
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}

class Account{
    private static long accountCnt = 101;
    private long accountNum;
    private double balance;
    private Person person;

    //Constructor for Account
    public Account(double balance, Person person){
        this.accountNum = accountCnt++;
        this.balance = balance;
        this.person = person;
    }

    //Getters
    public long getAccountNumber(){ return accountNum;}

    public double getBalance(){ return balance;}

    public Person getPerson(){ return person;}

    //Setters
    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAccountNumber(long accountNum){
        this.accountNum = accountNum;
    }

    public void setPerson(Person person){
        this.person = person;
    }

    public void deposit(double amount) throws IllegalArgumentException{
        if(amount <= 0){
            throw new IllegalArgumentException("Amount is less than zero. Cannot deposit");
        }
        balance += amount;
        System.out.println(amount + " deposited successfully");
    }

    public void withdraw(double amount) throws IllegalArgumentException{

        if(balance - amount < 500){
            throw new IllegalArgumentException("Minimum balance should be 500 in account. Cannot withdraw");
            
        }
        balance -= amount;
        System.out.println(amount + " withdraw successfully");
        
    }
}

class SavingsAccount extends Account{
    private final double MINIMUM_BALANCE = 500;

    public SavingsAccount(double balance, Person person){
       super(balance, person);
    }

    @Override
    public void withdraw(double amount) throws IllegalArgumentException{
        if(getBalance() - amount < 500){
            throw new IllegalArgumentException("Minimum balance should be 500 in account. Cannot withdraw");
        }
        setBalance(getBalance() - amount);
        System.out.println("Amount withdraswd succussfully");
    }

}

class CurrentAccount extends Account{
    private double overDraftLimit;

    public CurrentAccount(double balance, Person person, double overDraftLimit) throws IllegalArgumentException{
        super(balance, person);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double amount) throws IllegalArgumentException{
        if(getBalance() + overDraftLimit < amount){
            throw new IllegalArgumentException("Overdraft limit exceeded");
        }

        setBalance(getBalance() - amount);
        System.out.println("Amount withdrawed successfully");
    }
}

public class BankAccountSystem{
    public static void main(String[] args) {
        
        Person smith = new Person("Smith", 21);
        Person kathy = new Person("Kathy", 19);

        SavingsAccount smithAcc = new SavingsAccount(5000, smith);
        CurrentAccount kathyAcc = new CurrentAccount(4000, kathy, 1000);

        smithAcc.deposit(2000);
        kathyAcc.withdraw(2000);

        System.out.println(smith.getName() + " balance: " + smithAcc.getBalance());
        System.out.println(kathy.getName() + " balance: " + kathyAcc.getBalance());
    }
}