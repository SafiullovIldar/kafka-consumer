package com.kafka.listener;

import com.kafka.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageListener {

    @StreamListener(target = Sink.INPUT)
    public void handleMessage(Message message) {
        log.info("Message: " + message);
    }
}
