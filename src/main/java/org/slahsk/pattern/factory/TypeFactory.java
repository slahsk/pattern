package org.slahsk.pattern.factory;

import org.slahsk.pattern.type.Type;
import org.springframework.http.HttpHeaders;


public interface TypeFactory {
    <T> Type<T> getType(HttpHeaders headers, T data);
}
