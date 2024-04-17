package com.hitachirail.messageprocessor;

public class StrategyValidateErrorImplementation implements IStrategyValidate{

    public String validate(){

        return "No valid type specified, validation strategy = None";
    }
}
