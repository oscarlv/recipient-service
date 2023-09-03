package com.challenge.recipient.repository;

import com.challenge.recipient.entity.Recipient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RecipientRepository extends CrudRepository<Recipient, Long> {
    Recipient save(Recipient recipient);
    Optional<Recipient> findById(Long recipientId);
}
