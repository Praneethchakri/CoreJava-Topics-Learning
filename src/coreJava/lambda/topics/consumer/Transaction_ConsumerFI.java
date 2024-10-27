package functionalInterface.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Transaction_ConsumerFI {

	private int transactionId;
	private double amount;

	public Transaction_ConsumerFI(int transactionId, double amount) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transaction_ConsumerFI [transactionId=" + transactionId + ", amount=" + amount + "]";
	}

	public static void main(String[] args) {

		List<Transaction_ConsumerFI> trxList = new ArrayList<>();
		trxList.add(new Transaction_ConsumerFI(123, 234.2342));
		trxList.add(new Transaction_ConsumerFI(43543, 234242.3423432));

		Consumer<Transaction_ConsumerFI> trxConsumerFormater = trx -> System.out
				.println(String.format("TransactionID %d, Amonunt : %.2f", trx.transactionId, trx.amount));
		trxList.forEach(trxConsumerFormater);
		trxList.forEach(System.out::println);
	}

}
