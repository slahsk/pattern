package org.slahsk.pattern.type;

import org.slahsk.pattern.message.SendMessage;
import org.slahsk.pattern.model.DemoResult;

public class Type2<T> implements Type<T> {
    public Type2(SendMessage sendMessage) {
    }

    @Override
    public boolean isSync() {
        return false;
    }

    @Override
    public void setSync() {

    }

    @Override
    public T getData() {
        return null;
    }

    @Override
    public DemoResult getResult() {

    }
}
