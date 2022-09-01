package org.patterns.behavioral.strategy;


import java.util.LinkedList;

//Context 
public class PrintService {

    private OrderPrinter orderPrinter;
    public PrintService(OrderPrinter orderPrinter) {
        this.orderPrinter = orderPrinter;
    }

    public void printOrders(LinkedList<Order> orders) {
        orderPrinter.print(orders);
    }
}
