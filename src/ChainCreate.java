public interface ChainCreate {
    void setNextChain(ChainCreate nextChain);

    void withdraw(Amount amt);
}
