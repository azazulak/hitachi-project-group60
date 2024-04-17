package com.hitachirail.messageprocessor;

public class MessageProcessorSpeed extends MessageProcessor{

    MessageProcessorSpeed(){

        this.iValidate = new StrategyValidateTrainSpeedImplementation();

    }

    // if http://localhost:8080/message?type="speed" - unsure about context but assuming message type is related to train speed...
    String display(){
        return "Displaying train speed information from concrete class";
    }
}
