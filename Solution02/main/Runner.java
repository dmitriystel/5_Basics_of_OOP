package main;
/*
5. Basics of OOP
 
   Задача 2.
   
   Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать 
   покупку из нескольких товаров.
 */
import bean.Payment;
import bean.Payment.Product;
import view.PaymentView;

public class Runner {

	public static void main(String[] args) {

		Payment newPayment = new Payment();
		PaymentView view = new PaymentView();
		
		newPayment.addProduct(new Product("book1", 100));
		newPayment.addProduct(new Product("book2", 150));
		newPayment.addProduct(new Product("book3", 200));
		newPayment.addProduct(new Product("book4", 250));
		
		view.showInfoAboutPayment(newPayment);
	}
}
