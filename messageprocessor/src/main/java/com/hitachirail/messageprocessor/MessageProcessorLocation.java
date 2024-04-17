package com.hitachirail.messageprocessor;

public class MessageProcessorLocation extends MessageProcessor{

    // http://localhost:8080/message?type="location"
    MessageProcessorLocation(){

        this.iValidate = new StrategyValidateTrainLocationImplementation();

    }

    String display(){
        return "Displaying train location information from concrete class";
    }
}
