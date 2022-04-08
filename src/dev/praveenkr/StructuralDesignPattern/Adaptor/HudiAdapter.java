package dev.praveenkr.StructuralDesignPattern.Adaptor;

import dev.praveenkr.StructuralDesignPattern.Adaptor.Hudi.HudiConnector;

public class HudiAdapter implements IAdapter {

    HudiConnector hudiConnector = new HudiConnector();
    @Override
    public void connect() {}

    @Override
    public void execute() {
        hudiConnector.execute();
    }

    @Override
    public void timeTravel() {
        System.out.println("feature not available");
    }
}



