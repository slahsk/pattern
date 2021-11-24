package org.slahsk.pattern.message;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleSendMessage implements SendMessage {

    @Override
    public <T> void send(T data) {
        log.info("SimpleSendMessage data: {}", data);
    }
}
