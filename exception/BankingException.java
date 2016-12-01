public class BankingException extends Exception {
	
	public BankingException() {}

	public BankingException(String message) {
		super(message);
	}
	


	/*
		public class Exception extends Throwable{
			public Exception () {}

			public Exception (Sring message) {
				super(message);
			}
		}

		public class Throwable {
			private String message;

			public Throwable () {}

			public Throwable (String message) {
				this.message = message;
			} 

			public String getMessage () {
				return message;
			}
		}
	*/
}