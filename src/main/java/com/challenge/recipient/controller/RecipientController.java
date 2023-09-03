package com.challenge.recipient.controller;

import com.challenge.recipient.entity.Recipient;
import com.challenge.recipient.service.RecipientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RecipientController {

    @Autowired
    private RecipientService recipientService;

    @PostMapping(value = "/recipient", produces = "application/json")
    public ResponseEntity<Recipient> saveNewRecipient(@RequestBody Recipient recipient) {
        return new ResponseEntity<>(recipientService.createNewRecipient(recipient)
                , HttpStatus.OK);
    }

    @GetMapping(value = "/recipient/{recipientId}", produces = "application/json")
    public ResponseEntity<Recipient> getRecipient(@PathVariable Long recipientId) {
        return new ResponseEntity<>(recipientService.getRecipient(recipientId), HttpStatus.OK);
    }
}
