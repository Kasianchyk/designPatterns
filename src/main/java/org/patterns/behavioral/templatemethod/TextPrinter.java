package org.patterns.behavioral.templatemethod;

import java.util.Map;

//Concrete implementation. Implements steps needed..
//..by template method
public class TextPrinter extends OrderPrinter{


    @Override
    protected String start() {
        return "Order details";
    }

    @Override
    protected String formatOrderNumber(Order order) {
        return "Order #" + order.getId();
    }

    @Override
    protected String formatItems(Order order) {
        StringBuilder stringBuilder = new StringBuilder("Items\n-------------------------------\n");
        for (Map.Entry<String, Double> entry : order.getItems().entrySet()) {
            stringBuilder.append(entry.getKey() + " $" + entry.getValue() + "\n");
        }
        stringBuilder.append("------------------------------------");
        return stringBuilder.toString();
    }

    @Override
    protected String formatTotal(Order order) {
        return "Total: $" + order.getTotal();
    }

    @Override
    protected String end() {
        return "The End";
    }
}
