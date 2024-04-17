package com.hitachirail.messageprocessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageAPI {
    @Autowired
    MessageService messageService;
    @GetMapping("/message")
    String message(@RequestParam String type){

        return messageService.process(type);

    }

}
