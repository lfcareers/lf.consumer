package com.lf.lf.consumer.services;


import com.lf.lf.consumer.models.TransactionMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = {"transaction-topic"}, groupId="group-id")
    public void consume(TransactionMessage transactionMessage){
        log.info("We received the transaction with the id "
                + transactionMessage.getTransactionId() +
                " the status is " + transactionMessage.getStatus());
    }
}
