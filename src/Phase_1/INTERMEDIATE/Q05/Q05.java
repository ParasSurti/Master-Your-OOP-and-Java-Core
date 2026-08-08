//Create a class BankAccount and use this to distinguish the instance field balance from a parameter of the same name.
package Phase_1.INTERMEDIATE.Q05;

public class Q05
{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("paras", 21000);
        System.out.println( "Name : " + bankAccount.name + "\n" + "Balance : " + bankAccount.balance);
    }
}
