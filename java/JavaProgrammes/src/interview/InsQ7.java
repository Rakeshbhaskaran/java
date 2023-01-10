package interview;

public class InsQ7 {
	public static void main(String[] args) throws coupanIsNotApplicable {
		int cardAmt =999;
		if(cardAmt<999) {
			System.out.println("coupon applied");
		}
		else {
			throw new coupanIsNotApplicable();
		}
	}

}
