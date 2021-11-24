package org.slahsk.pattern.type;

import org.slahsk.pattern.model.DemoResult;

public interface Type<T> {

    boolean isSync();

    void setSync();

    T getData();

    DemoResult getResult();
}
