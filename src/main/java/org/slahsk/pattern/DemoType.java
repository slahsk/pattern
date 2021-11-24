package org.slahsk.pattern;

import org.slahsk.pattern.cycle.DemoBefore;
import org.slahsk.pattern.factory.TypeFactory;
import org.slahsk.pattern.type.Type;
import org.springframework.http.HttpHeaders;

public class DemoType {


    private TypeFactory typeFactory;


    public DemoType(TypeFactory typeFactory) {
        this.typeFactory = typeFactory;
    }

    public <T> DemoBefore<T> create(HttpHeaders headers, T body) {
        Type<T> type = typeFactory.getType(headers, body);


        return new DemoBefore(type);
    }
}
