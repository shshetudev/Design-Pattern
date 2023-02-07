package org.shshetudev.behavioral.mediator.implementation;

import org.shshetudev.behavioral.mediator.implementation.colleague.Button;
import org.shshetudev.behavioral.mediator.implementation.colleague.Heater;
import org.shshetudev.behavioral.mediator.implementation.colleague.Machine;
import org.shshetudev.behavioral.mediator.implementation.colleague.Valve;
import org.shshetudev.behavioral.mediator.implementation.mediator.CottonMediator;
import org.shshetudev.behavioral.mediator.implementation.mediator.DenimMediator;
import org.shshetudev.behavioral.mediator.implementation.mediator.MachineMediator;
import org.shshetudev.behavioral.mediator.implementation.others.Motor;
import org.shshetudev.behavioral.mediator.implementation.others.Sensor;
import org.shshetudev.behavioral.mediator.implementation.others.SoilRemoval;

public class TestMediator {
    public static void main(String[] args) {
        MachineMediator mediator = null;
        Sensor sensor = new Sensor();
        SoilRemoval soilRemoval = new SoilRemoval();
        Motor motor = new Motor();
        Machine machine = new Machine();
        Heater heater = new Heater();
        Valve valve = new Valve();
        Button button = new Button();

        mediator = new CottonMediator(machine, heater, motor, sensor, soilRemoval, valve);

        button.setMediator(mediator);
        machine.setMediator(mediator);
        heater.setMediator(mediator);
        valve.setMediator(mediator);

        button.press();

        System.out.println("*****************************************************************");

        mediator = new DenimMediator(machine, heater, motor, sensor, soilRemoval, valve);

        button.setMediator(mediator);
        machine.setMediator(mediator);
        heater.setMediator(mediator);
        valve.setMediator(mediator);

        button.press();
    }
}
