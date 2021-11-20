package logic;

import bean.Payment;
import bean.Payment.Product;

public class PaymentAction {
	public double paymentCost(Payment payment) {
		double totalCost = 0;

		for(Product prod : payment.getProductList()) {
			totalCost += prod.getPrice();
		}
		return totalCost;
	}
}
