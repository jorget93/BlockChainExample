import java.util.List;
import java.util.Objects;

public class Block {

    private int prevHash;
    private List<Transaction> transactions;

    public Block(int prevHash, List<Transaction> transactions) {
        this.prevHash = prevHash;
        this.transactions = transactions;
    }

    public int getPrevHash() {
        return prevHash;
    }

    public void setPrevHash(int prevHash) {
        this.prevHash = prevHash;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Block block = (Block) o;
        return prevHash == block.prevHash && Objects.equals(transactions, block.transactions);
    }

    @Override
    public int hashCode() {
        int result = prevHash;
        result = 21 * result + (transactions != null ? transactions.hashCode() : 0);
        return result;
    }
}
