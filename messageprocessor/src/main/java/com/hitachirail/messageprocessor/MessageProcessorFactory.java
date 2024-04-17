package com.hitachirail.messageprocessor;

public class MessageProcessorFactory {

    static MessageProcessor getMessageProcessor(String type){

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


        return messageProcessor;

    }
}
