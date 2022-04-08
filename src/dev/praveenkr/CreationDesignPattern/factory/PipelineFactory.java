package dev.praveenkr.CreationDesignPattern.factory;

public class PipelineFactory {

    public static Pipeline getPipeline(PipelineType type){
        if(type.equals(PipelineType.HUDI)){
           return new HudiPipeline();
        }
        if(type.equals(PipelineType.KAFKA)){
            return new KafkaPipeline();
        }
        return null;
    }
}
