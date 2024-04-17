package com.hitachirail.messageprocessor;


import org.springframework.stereotype.Service;

@Service
public class MessageService {

    String process(String type){

        MessageProcessor messageProcessor = null;

        switch(type){
            case "location":
                messageProcessor = new MessageProcessorLocation();
                break;
            case "speed":
                messageProcessor = new MessageProcessorSpeed();
                break;
            case "status":
                messageProcessor = new MessageProcessorStatus();
                break;
            default:{messageProcessor = new MessageProcessorError();}
        }

        // SHOWS FLEXIBLE NATURE OF DESIGN STRATEGY
        // Calling setter method to be able to change implementation strategy at runtime
        // messageProcessor.setValidationStrategy(new StrategyValidateNoImplementation());

        return
                messageProcessor.display() + "<br>" +
                        messageProcessor.validate() + "<br>" +
                        messageProcessor.printMessage();
    }

    }

