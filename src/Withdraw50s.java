public class Withdraw50s implements ChainCreate{
    private ChainCreate chain;

    @Override
    public void setNextChain(ChainCreate nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void withdraw(Amount amt) {
        if(amt.getAmount() >= 50){
            int numNotes = amt.getAmount()/50;
            int remainder = amt.getAmount() % 50;
            System.out.println(numNotes + " €50 note(s)");
            if(remainder !=0) this.chain.withdraw(new Amount(remainder));
        }else{
            this.chain.withdraw(amt);
        }
    }

}
