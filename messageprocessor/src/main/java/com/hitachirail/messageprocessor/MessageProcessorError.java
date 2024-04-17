package com.hitachirail.messageprocessor;

public class MessageProcessorError extends MessageProcessor{
    MessageProcessorError(){

        this.iValidate = new StrategyValidateErrorImplementation();

    }

    String display(){
        return "No valid type specified, display = None";
    }

    @Override
    String printMessage() {
        return "No valid type specified, processed message = None";
    }
}


