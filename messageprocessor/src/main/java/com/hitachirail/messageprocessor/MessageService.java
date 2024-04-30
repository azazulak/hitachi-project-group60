package com.hitachirail.messageprocessor;


import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Service
public class MessageService {

    String process(String type){

        // 1. Getting from MessageProcessorFactory based on the type coming in
        MessageProcessor messageProcessor = MessageProcessorFactory.getMessageProcessor(type);

        // SHOWS FLEXIBLE NATURE OF DESIGN STRATEGY
        // - You can uncomment the line of code below to generically
        // call (within MessageService) the methods off of the processor to return it back to the MessageAPI-
        // which then prints it back to the browser

        // (Calling setter method to be able to change implementation strategy at runtime):
        // messageProcessor.setValidationStrategy(new StrategyValidateNoImplementation());

        return
                messageProcessor.display() + "<br>" +
                        messageProcessor.validate() + "<br>" +
                        messageProcessor.printMessage();
    }

    private Map<Long, String> messages = new ConcurrentHashMap<>();

    // Method to update message content
    public boolean updateMessageContent(Long id, String content) {
        if (messages.containsKey(id)) {
            messages.put(id, content);
            return true;
        }
        return false;
    }
}

