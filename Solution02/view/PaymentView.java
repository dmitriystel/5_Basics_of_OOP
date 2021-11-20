package view;

import bean.Payment;
import bean.Payment.Product;
import logic.PaymentAction;

public class PaymentView {
	PaymentAction action = new PaymentAction();

	public void showInfoAboutPayment(Payment payment) {
		System.out.println("Products report");
		for(Product prod : payment.getProductList()) {
			System.out.println(prod.getName() + ", price = " + prod.getPrice());
		}
		System.out.println("Purchased by " + payment.getProductList().size() + " position (s) totaling = " + action.paymentCost(payment));
	}
}
