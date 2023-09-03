package com.challenge.recipient.service;

import com.challenge.recipient.entity.Recipient;

public interface RecipientService {
    Recipient createNewRecipient(Recipient recipient);

    Recipient getRecipient(Long recipientId);
}
