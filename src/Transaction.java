import java.util.Objects;

public class Transaction {

    private String source;
    private String destination;
    private Long transactionAmount;

    public Transaction(String source, String destination, Long transationAmount) {
        this.source = source;
        this.destination = destination;
        this.transactionAmount = transationAmount;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Long getTransationAmount() {
        return transactionAmount;
    }

    public void setTransationAmount(Long transationAmount) {
        this.transactionAmount = transationAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(source, that.source) && Objects.equals(destination, that.destination) && Objects.equals(transactionAmount, that.transactionAmount);
    }

    @Override
    public int hashCode() {
        int result = source != null ? source.hashCode() : 0;
        result = 21 * result + (destination != null ? destination.hashCode() : 0);
        result = 21 * result + (transactionAmount != null ? transactionAmount.hashCode() : 0);
        return result;
    }
}
