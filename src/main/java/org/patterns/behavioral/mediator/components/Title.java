package org.patterns.behavioral.mediator.components;

import org.patterns.behavioral.mediator.mediator.Mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class Title extends JTextArea implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "Title";
    }
}
