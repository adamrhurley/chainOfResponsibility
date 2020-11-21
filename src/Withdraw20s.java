public class Withdraw20s implements ChainCreate {
    private ChainCreate chain;

    @Override
    public void setNextChain(ChainCreate nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void withdraw(Amount amt) {
        if(amt.getAmount() >= 20){
            int numNotes = amt.getAmount()/20;
            int remainder = amt.getAmount() % 20;
            System.out.println(numNotes + " €20 note(s)");
            if(remainder !=0) this.chain.withdraw(new Amount(remainder));
        }else{
            this.chain.withdraw(amt);
        }
    }
}
