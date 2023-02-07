package org.shshetudev.behavioral.mediator.implementation.others;

public class Motor {
    public void startMotor() {
        System.out.println("Start motor");
    }

    public void rotateDrum(int rpm) {
        System.out.println("Rotating drum at " + rpm + " rpm.");
    }
}
