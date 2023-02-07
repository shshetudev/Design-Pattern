package org.shshetudev.behavioral.mediator.implementation.colleague;

import org.shshetudev.behavioral.mediator.implementation.mediator.MachineMediator;

public class Button implements Colleague {
    private MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        System.out.println("Button pressed.");
        mediator.start();
    }
}
