package org.patterns.behavioral.memento.command;

public interface WorkflowCommand {

    void execute();

    void undo();
}
