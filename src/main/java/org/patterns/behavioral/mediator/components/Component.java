package org.patterns.behavioral.mediator.components;

import org.patterns.behavioral.mediator.mediator.Mediator;

/**
 * Common component interface.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
