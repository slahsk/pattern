package org.slahsk.pattern.message;

public interface SendMessage {
    <T> void send(T data);
}
