package org.patterns.behavioral.state;

//Context class
public class Order {

	private OrderState currentState;

	public Order() {
		currentState = new New();
	}
	
	public double cancel() {
		double charge = currentState.handleCancellation();
		currentState = new Cancelled();
		return charge;
	}
   
	public void paymentSuccessful() {
		currentState = new Paid();
	}
	
	public void dispatched() {
		currentState = new InTransit();
	}
	
	public void delivered() {
		currentState = new Delivered();
	}
}
