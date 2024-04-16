package com.hitachirail.messageprocessor_demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import com.hitachirail.messageprocessor_demo.model.XmlMessage;

public class DefaultXmlProcessingService implements XmlProcessingService{
    @Override
    public XmlMessage process(XmlMessage message) {
        // Default processing logic
        return message;
    }
}
