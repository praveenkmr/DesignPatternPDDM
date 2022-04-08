package dev.praveenkr.CreationDesignPattern.factory;


public class KafkaPipeline implements Pipeline{
    @Override
    public void process() {
        System.out.println("This is a Kafka Pipeline..");
    }
}
