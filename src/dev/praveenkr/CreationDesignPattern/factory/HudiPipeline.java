package dev.praveenkr.CreationDesignPattern.factory;

public class HudiPipeline implements Pipeline {

    @Override
    public void process() {
        System.out.println("This is a Hudi Pipeline..");
    }
}
