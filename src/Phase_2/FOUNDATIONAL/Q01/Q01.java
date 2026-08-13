// Create a class BankAccount with a private balance field and public getBalance()/setBalance() methods.
package Phase_2.FOUNDATIONAL.Q01;

public class Q01
{
    public static void main(String[] args)
    {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.getBalance());
        bankAccount.setBalance(5000.32);
        System.out.println(bankAccount.getBalance());
    }
}
