package org.patterns.behavioral.templatemethod;

import java.io.FileNotFoundException;

public class Client {

	public static void main(String[] args) throws FileNotFoundException {
		Order order = new Order("1001");
		order.addItem("Soda", 2.50);
		order.addItem("Pizza", 5.0);
		order.addItem("Beer", 5.0);
		OrderPrinter orderPrinter = new TextPrinter();
		orderPrinter.printOrder(order, "filename");
	}
}
