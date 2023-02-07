package org.shshetudev.behavioral.mediator.implementation.colleague;

import org.shshetudev.behavioral.mediator.implementation.mediator.MachineMediator;

public class Valve implements Colleague {
    private MachineMediator mediator;
    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    public void open() {
        System.out.println("Valve is opened...");
        System.out.println("Filling water...");
        mediator.closed();
    }

    public void closed() {
        System.out.println("Valve is closed");
        mediator.on();
    }
}
