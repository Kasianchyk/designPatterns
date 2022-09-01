package org.patterns.creational.factorymethod;


import org.patterns.creational.factorymethod.message.JSONMessage;
import org.patterns.creational.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
