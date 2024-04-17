package com.hitachirail.messageprocessor;

public class MessageProcessorStatus extends MessageProcessor{

    MessageProcessorStatus(){

        this.iValidate = new StrategyValidateNoImplementation();

    }

    String display(){

        return "Displaying train status information from concrete class";

    }

}
