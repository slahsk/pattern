package org.slahsk.pattern.cycle;

import org.slahsk.pattern.model.Type3NextData;

import java.util.function.Function;

public interface Type3Next<T, U> {

    After<T, U> next(Function<Type3NextData, String> next);
}
