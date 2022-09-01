package org.patterns.behavioral.mediator;

import org.patterns.behavioral.mediator.components.*;
import org.patterns.behavioral.mediator.mediator.Editor;
import org.patterns.behavioral.mediator.mediator.Mediator;

import javax.swing.*;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
