package dev.praveenkr.StructuralDesignPattern.Adaptor;

import dev.praveenkr.StructuralDesignPattern.Adaptor.Delta.DeltaConnector;

public class DeltaAdaptor implements IAdapter {

    DeltaConnector deltaConnector = new DeltaConnector();
    @Override
    public void connect() {

    }

    @Override
    public void execute() {
        deltaConnector.executeQuery();
    }

    @Override
    public void timeTravel() {
        System.out.println("time travel feature in delta");
    }


}
