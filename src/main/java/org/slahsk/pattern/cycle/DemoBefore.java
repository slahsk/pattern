package org.slahsk.pattern.cycle;

import org.slahsk.pattern.type.Type;

import java.util.function.Function;
import java.util.function.Supplier;

public class DemoBefore<T> implements Before<T> {
    public <T> DemoBefore(Type<T> type) {
    }

    @Override
    public Before<T> uri(Supplier<String> uri) {
        return null;
    }

    @Override
    public Before<T> async(Supplier<String> async) {
        return null;
    }

    @Override
    public Before<T> data(Function<T, T> data) {
        return null;
    }
}
