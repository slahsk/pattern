package org.slahsk.pattern.cycle;

import java.util.function.Function;
import java.util.function.Supplier;

public interface Before<T> {
    Before<T> uri(Supplier<String> uri);

    Before<T> async(Supplier<String> async);

    Before<T> data(Function<T, T> data);

    Service<T> end();
}
