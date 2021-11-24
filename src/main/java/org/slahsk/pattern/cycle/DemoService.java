package org.slahsk.pattern.cycle;

import org.slahsk.pattern.model.AfterData;
import org.slahsk.pattern.model.BeforeData;

import java.util.function.Function;

public class DemoService<T> implements Service<T> {
    @Override
    public <U> After<T, U> service(Function<BeforeData<T>, AfterData<U>> service) {
        return null;
    }
}
