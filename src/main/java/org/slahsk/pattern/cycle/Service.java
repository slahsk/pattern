package org.slahsk.pattern.cycle;

import org.slahsk.pattern.model.AfterData;
import org.slahsk.pattern.model.BeforeData;

import java.util.function.Function;

public interface Service<T> {
    <U> After<T, U> service(Function<BeforeData<T>, AfterData<U>> service);

}
