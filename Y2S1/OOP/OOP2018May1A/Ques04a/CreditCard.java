package Ques04a;

public class CreditCard {
	private static CreditCard instance;
	
	private CreditCard() {}
	
	public static synchronized CreditCard getInstance() {
		if(instance == null) {
			instance = new CreditCard();
		}
		return instance;
	}
	
	public boolean validate(String cardno,int code) {
		if(cardno.length() == 16 && code%3 == 0) {
			return true;
		}else {
			return false;
		}
	}
}
