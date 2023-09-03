package com.challenge.recipient.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "recipients")
public class Recipient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipient_id")
    private Long recipientId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "routing_number")
    private String routingNumber;

    @Column(name = "national_id")
    private String nationalId;

    @Column(name = "account_number")
    private String accountNumber;

}
