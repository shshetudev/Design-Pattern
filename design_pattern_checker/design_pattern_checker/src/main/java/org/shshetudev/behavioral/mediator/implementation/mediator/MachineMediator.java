package org.shshetudev.behavioral.mediator.implementation.mediator;

public interface MachineMediator {
    void start();

    void wash();

    void open();

    void closed();

    void on();

    void off();

    boolean checkTemperature(int temp);
}
