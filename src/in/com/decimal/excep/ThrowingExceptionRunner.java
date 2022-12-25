package in.com.decimal.excep;

class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount that) throws CurrenciesDoNotMatchException {
		if (!this.currency.equals(that.currency)) {
//			throw new Exception("Currencies Don't Match " + this.currency + " & " + that.currency);

			// now customs exception:
			throw new CurrenciesDoNotMatchException("Currencies Don't Match " + this.currency + " & " + that.currency);
		}
		this.amount += that.amount;

	}

	@Override
	public String toString() {
		return "Amount [currency=" + currency + ", amount=" + amount + "]";
	}

}

class CurrenciesDoNotMatchException extends Exception {

	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

public class ThrowingExceptionRunner {
	public static void main(String[] args) throws CurrenciesDoNotMatchException {
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 20);

		amount1.add(amount2);
		System.out.println(amount1);

	}
}