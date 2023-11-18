public class Main {
    public static void main(String[] args) {
        PersonalAccount rai = new PersonalAccount(220104074, "Raheba");
        PersonalAccount ami = new PersonalAccount(220104031, "Amira");
        try {
            rai.deposit(500);
            rai.withdraw(700); // This withdrawal will throw InsufficientBalanceException
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        rai.printTransactionHistory();
    }
}