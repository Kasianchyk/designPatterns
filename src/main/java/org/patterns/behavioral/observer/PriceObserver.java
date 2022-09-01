package org.patterns.behavioral.observer;

//Concrete observer
public class PriceObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        double total = order.getItemCost();
        if (total >= 500) {
            order.setDiscount(30);
        }
        if (total >= 200) {
            order.setDiscount(10);
        }
    }
}
