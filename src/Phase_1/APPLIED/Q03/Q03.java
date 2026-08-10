//Demonstrate static vs instance variables using BankAccount (static interestRate, instance balance).
package Phase_1.APPLIED.Q03;

public class Q03
{
    public static void main(String[] args)
    {
        BankAccount bankAccount = new BankAccount();
        bankAccount.balance = 5000;
        BankAccount.interestRate = 12.2f;
        System.out.println(bankAccount.balance);
        System.out.println(BankAccount.interestRate);

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.balance = 3200;
        BankAccount.interestRate = 5.5f;
        System.out.println(bankAccount.balance);
        System.out.println(BankAccount.interestRate);
    }
}
