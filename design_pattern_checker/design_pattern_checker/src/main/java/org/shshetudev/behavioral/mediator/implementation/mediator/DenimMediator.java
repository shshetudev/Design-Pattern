package org.shshetudev.behavioral.mediator.implementation.mediator;

import org.shshetudev.behavioral.mediator.implementation.colleague.Heater;
import org.shshetudev.behavioral.mediator.implementation.colleague.Machine;
import org.shshetudev.behavioral.mediator.implementation.colleague.Valve;
import org.shshetudev.behavioral.mediator.implementation.others.Motor;
import org.shshetudev.behavioral.mediator.implementation.others.Sensor;
import org.shshetudev.behavioral.mediator.implementation.others.SoilRemoval;

public class DenimMediator implements MachineMediator {

    private final Machine machine;
    private final Heater heater;
    private final Motor motor;
    private final Sensor sensor;
    private final SoilRemoval soilRemoval;
    private final Valve valve;

    public DenimMediator(Machine machine, Heater heater, Motor motor, Sensor sensor, SoilRemoval soilRemoval, Valve valve) {
        this.machine = machine;
        this.heater = heater;
        this.motor = motor;
        this.sensor = sensor;
        this.soilRemoval = soilRemoval;
        this.valve = valve;

        System.out.println("Setting up for DENIM program");
    }

    @Override
    public void start() {
        machine.start();
    }

    @Override
    public void wash() {
        motor.startMotor();
        motor.rotateDrum(1400);
        System.out.println("Adding detergent");
        soilRemoval.medium();
        System.out.println("Adding softener");
    }

    @Override
    public void open() {
        valve.open();
    }

    @Override
    public void closed() {
        valve.closed();
    }

    @Override
    public void on() {
        heater.on(30);
    }

    @Override
    public void off() {
        heater.off();
    }

    @Override
    public boolean checkTemperature(int temp) {
        return sensor.checkTemperature(temp);
    }
}
