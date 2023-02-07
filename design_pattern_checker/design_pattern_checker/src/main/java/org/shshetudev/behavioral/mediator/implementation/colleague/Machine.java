package org.shshetudev.behavioral.mediator.implementation.colleague;

import org.shshetudev.behavioral.mediator.implementation.mediator.MachineMediator;

public class Machine implements Colleague {
    private MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    public void start() {
        mediator.open();
    }

    public void wash() {
        mediator.wash();
    }
}
