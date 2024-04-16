package com.hitachirail.messageprocessor_demo.controller;

import com.hitachirail.messageprocessor_demo.model.XmlMessage;
import com.hitachirail.messageprocessor_demo.service.XmlProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final XmlProcessingService processingService;

    @Autowired
    public MessageController(XmlProcessingService processingService) {
        this.processingService = processingService;
    }

    @PostMapping(consumes = "application/xml", produces = "application/xml")
    public ResponseEntity<XmlMessage> processMessage(@RequestBody XmlMessage message) {
        XmlMessage processedMessage = processingService.process(message);
        return ResponseEntity.ok(processedMessage);
    }
}