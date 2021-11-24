package org.slahsk.pattern.cycle;

import org.slahsk.pattern.model.Type2NextData;

import java.util.function.Function;

public interface Type2Next<T, U> {

    After<T, U> next(Function<Type2NextData, Integer> next);
}
