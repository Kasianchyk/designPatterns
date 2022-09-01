package org.patterns.creational.factorymethod;


import org.patterns.creational.factorymethod.message.Message;
import org.patterns.creational.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
