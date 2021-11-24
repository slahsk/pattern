package org.slahsk.pattern.type;

import java.util.Objects;

public interface ExceptionResult {

    ExceptionType getExceptiontype();

    default TypeError createTypeError(ExceptionType exceptionType) {

        return null;
    }

    default boolean isError() {
        return Objects.isNull(getExceptiontype());
    }
}
