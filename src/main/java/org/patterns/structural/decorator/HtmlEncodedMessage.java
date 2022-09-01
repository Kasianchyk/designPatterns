package org.patterns.structural.decorator;


import org.apache.commons.text.StringEscapeUtils;

import java.lang.invoke.StringConcatException;

//Decorator. Implements component interface
public class HtmlEncodedMessage implements Message{

    private Message msg;

    public HtmlEncodedMessage(Message msg){
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml4(msg.getContent());
    }
}
