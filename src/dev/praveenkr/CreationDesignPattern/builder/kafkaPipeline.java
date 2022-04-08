package dev.praveenkr.CreationDesignPattern.builder;

public  class kafkaPipeline {
    private final String pipelineName;
    private final String kafkaTopic;
    private final OperationModes operationMode;
    private final String primaryKey;

    private kafkaPipeline(kafkaPipeline.Builder builder){
        this.pipelineName = builder.pipelineName;
        this.kafkaTopic = builder.kafkaTopic;
        this.operationMode = builder.operationMode;
        this.primaryKey = builder.primaryKey;
    }

    public String getPipelineName() {
        return pipelineName;
    }

    public String getKafkaTopic() {
        return kafkaTopic;
    }

    public OperationModes getOperationMode() {
        return operationMode;
    }

    public String getPrimaryKey() {
        return primaryKey;
    }


    @Override
    public String toString() {
        return "Pipeline{" +
                "pipelineName='" + pipelineName + '\'' +
                ", kafkaTopic='" + kafkaTopic + '\'' +
                ", operationMode='" + operationMode + '\'' +
                ", primaryKey='" + primaryKey + '\'' +
                '}';
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private String pipelineName;
        private String kafkaTopic;
        private OperationModes operationMode;
        private String primaryKey;

        public Builder pipelineName(String pipelineName){
            this.pipelineName = pipelineName;
            return this;
        }

        public Builder kafkaTopic(String kafkaTopic){
            this.kafkaTopic = kafkaTopic;
            return this;
        }

        public Builder operationMode(OperationModes OperationMode){
            this.operationMode = OperationMode;
            return this;
        }

        public Builder primaryKey(String primaryKey){
            this.primaryKey = primaryKey;
            return this;
        }


        public kafkaPipeline build(){
            if (validate())
                return new kafkaPipeline(this);
            return null;
        }

        private boolean validate(){
            if(this.kafkaTopic.isEmpty()) {
                System.out.println("Kafka Topic can't be null");
                return false;
            }
            return true;
        }

    }
}
