package dev.praveenkr;
import dev.praveenkr.CreationDesignPattern.builder.OperationModes;
import dev.praveenkr.CreationDesignPattern.builder.kafkaPipeline;
import dev.praveenkr.CreationDesignPattern.factory.*;
import dev.praveenkr.CreationDesignPattern.singleton.DBConnector;
import dev.praveenkr.StructuralDesignPattern.Adaptor.DeltaAdaptor;
import dev.praveenkr.StructuralDesignPattern.Adaptor.HudiAdapter;
import dev.praveenkr.StructuralDesignPattern.Adaptor.IAdapter;


public class Main {

    public static void main(String[] args) {

        //Singleton Design Pattern
        DBConnector dbConnector = DBConnector.getInstance();
        System.out.println(dbConnector.hashCode());

        dbConnector.insert();

        DBConnector dbConnector1 = DBConnector.getInstance();
        System.out.println(dbConnector1.hashCode());



        //Builder Design Pattern
        kafkaPipeline newPipeline = kafkaPipeline.getBuilder()
                .pipelineName("test")
                .kafkaTopic("temp")
                .operationMode(OperationModes.APPEND)
                .build();

        System.out.println(newPipeline.toString());



        //  Factory Design Pattern
        Pipeline pipeline = PipelineFactory.getPipeline(PipelineType.KAFKA);
        pipeline.process();

        Pipeline pipeline1 = PipelineFactory.getPipeline(PipelineType.HUDI);
        pipeline1.process();




        // Adaptor Design Pattern

        IAdapter connector = new DeltaAdaptor();
        connector.execute();

        IAdapter connector1 = new HudiAdapter();
        connector1.execute();
    }
}



