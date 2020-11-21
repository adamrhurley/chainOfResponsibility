public class Withdraw10s implements ChainCreate {

    private ChainCreate chain;

    @Override
    public void setNextChain(ChainCreate nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void withdraw(Amount amt) {
        if (amt.getAmount() >= 10) {
            int numNotes = amt.getAmount() / 10;
            int remainder = amt.getAmount() % 10;
            System.out.println(numNotes + " €10 note(s)");
            if (remainder != 0) this.chain.withdraw(new Amount(remainder));
        } else {
            this.chain.withdraw(amt);
        }
    }
}