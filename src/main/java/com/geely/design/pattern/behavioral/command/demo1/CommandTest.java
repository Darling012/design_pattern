package com.geely.design.pattern.behavioral.command.demo1;

public class CommandTest {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.pressed();
    }
}
