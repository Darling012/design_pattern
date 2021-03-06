package com.geely.design.pattern.behavioral.command.demo1;

public class LightOffCOmmand implements Command {
    Light light;

    public LightOffCOmmand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
