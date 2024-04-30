package com.hitachirail.messageprocessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageAPI {
    @Autowired
    MessageService messageService;
    @GetMapping("/message")
    String message(@RequestParam String type){

        return messageService.process(type);

    }

    @PutMapping("/message/{id}")
    // There is no message class, and I am unaware of how the classes inherit each other (i.e MessageApi to MessageService?...)
    public String updateMessage(@PathVariable Long id, @RequestBody String content) {
        boolean updated = messageService.updateMessageContent(id, content);
        if (updated) {
            return "Message updated successfully with content: " + content;
        } else {
            return "Message not found with ID: " + id;
        }
    }
}
