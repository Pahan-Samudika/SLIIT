package Ques04a;

public class MainApp {

	public static void main(String[] args) {
		CreditCard card1 = CreditCard.getInstance();
		CreditCard card2 = CreditCard.getInstance();
		
		boolean card1Validity = card1.validate("1234567891234567", 333); //Validity should be true
		boolean card2Validity = card2.validate("9876543211", 345); //Validity should be false
		
		System.out.println("Card 1 Validity = "+card1Validity);
		System.out.println("Card 2 Validity = "+card2Validity);
		
		if (card1 == card2) {
            System.out.println("Both objects refer to the same CreditCard instance.");
        } else {
            System.out.println("Objects do not refer to the same CreditCard instance.");
        }
	}

}
