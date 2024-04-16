package com.hitachirail.messageprocessor_demo.service;

import com.hitachirail.messageprocessor_demo.model.XmlMessage;
public interface XmlProcessingService {
    XmlMessage process(XmlMessage message);
}
