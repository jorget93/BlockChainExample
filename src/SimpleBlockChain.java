import java.util.Arrays;

public class SimpleBlockChain {

    public static void main(String[] args){

        Transaction firstTransaction = new Transaction("Gerg","Jorge", 1001l);
        Transaction secondTransaction = new Transaction("Robert", "Tyler", 1000L);
        Transaction thirdTransaction = new Transaction("Zed","Jules",10000L);
        Transaction fourthTransaction = new Transaction("Yoda","Luke", 100000L);
        Transaction fifthTransaction = new Transaction("Mando", "Cara", 1000L);


        System.out.println("First transaction hash code: " + firstTransaction.hashCode());
        System.out.println("Second transaction hash code: " + secondTransaction.hashCode());

        Block firstBlock = new Block(0, Arrays.asList(firstTransaction, secondTransaction));
        System.out.println("\nFirst block hash code: " + firstBlock.hashCode());

        Block secondBlock = new Block (firstBlock.hashCode(), Arrays.asList(thirdTransaction));
        System.out.println("Second block hash code: " + secondBlock.hashCode());

        Block thirdBlock = new Block (secondBlock.hashCode(), Arrays.asList(fourthTransaction));
        System.out.println("Third block hash code: " + thirdBlock.hashCode());

        Block fourthBlock = new Block (thirdBlock.hashCode(), Arrays.asList(fifthTransaction));
        System.out.println("Fourth block hash code: " + thirdBlock.hashCode());

        /*

         */


    }
}
