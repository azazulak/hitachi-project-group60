package com.hitachirail.messageprocessor;

abstract public class MessageProcessor {

    IStrategyValidate iValidate;

    abstract String display();

    String validate(){
        // the "validate" call is going to be assigned to one of the implementations based on the MessageProcessor subtypes
        // it will be delegated to the default implementation or "strategy" defined in each subclass (i.e StrategyValidateTrainLocationImplementation...etc.)
        return this.iValidate.validate();
    }

    String printMessage(){
        return "Printing processed message";
    }

    // Setter Method to give us the ability to make a decision after the classes have been constructed (in MessageAPI class we can set whatever strategy we want if anything changes with client)
    void setValidationStrategy( IStrategyValidate iValidationStrategyImplementation){

        this.iValidate = iValidationStrategyImplementation;

    }
}
