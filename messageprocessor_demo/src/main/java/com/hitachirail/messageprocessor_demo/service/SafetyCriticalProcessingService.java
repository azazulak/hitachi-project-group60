package com.hitachirail.messageprocessor_demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import com.hitachirail.messageprocessor_demo.model.XmlMessage;

@Service
@Profile("safety-critical")
public class SafetyCriticalProcessingService implements XmlProcessingService{
    @Override
    public XmlMessage process(XmlMessage message) {
        // Safety-critical processing logic
        return message;
    }
}
