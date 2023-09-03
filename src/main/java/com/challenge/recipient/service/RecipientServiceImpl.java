package com.challenge.recipient.service;

import com.challenge.recipient.entity.Recipient;
import com.challenge.recipient.exception.RecipientNotFoundException;
import com.challenge.recipient.repository.RecipientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipientServiceImpl implements RecipientService {

    @Autowired
    RecipientRepository recipientRepository;

    public Recipient createNewRecipient(Recipient recipient) {
        return recipientRepository.save(recipient);
    }

    @Override
    public Recipient getRecipient(Long recipientId) {
        return recipientRepository.findById(recipientId).orElseThrow(() -> new RecipientNotFoundException("Recipient not found with ID: " + recipientId));
    }
}
