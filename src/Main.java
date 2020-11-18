import java.util.Scanner;

public class Main {
    private final ChainCreate chain1;

    public Main() {
        this.chain1 = new Withdraw50s();
        ChainCreate chain2 = new Withdraw20s();
        ChainCreate chain3 = new Withdraw10s();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
    }

    public static void main(String[] args) {

        Main ATM = new Main();
        while (true) {
            int amount;
            System.out.print("Enter amount to withdraw: ");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount must be a multiple of 10.");
                return;
            }
            ATM.chain1.withdraw(new Amount(amount));
        }

    }

}

