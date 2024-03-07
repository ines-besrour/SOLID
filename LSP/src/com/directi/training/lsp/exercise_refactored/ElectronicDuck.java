package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck extends Duck {

    private boolean _on = false;

    @Override
    public void quack()
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } // No else condition, if the duck is off, it remains silent.
    }

    @Override
    public void swim()
    {
        if (_on) {
            System.out.println("Electronic duck swim");
        } // No else condition, if the duck is off, it does not swim.
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }
}
