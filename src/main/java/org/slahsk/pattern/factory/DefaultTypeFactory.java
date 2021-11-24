package org.slahsk.pattern.factory;

import org.slahsk.pattern.message.SendMessage;
import org.slahsk.pattern.type.Type;
import org.slahsk.pattern.type.Type1;
import org.slahsk.pattern.type.Type2;
import org.slahsk.pattern.type.Type3;
import org.springframework.http.HttpHeaders;
import org.springframework.util.Assert;

import java.util.Map;


public class DefaultTypeFactory implements TypeFactory {
    private SendMessage sendMessage;

    public DefaultTypeFactory(SendMessage sendMessage) {
        this.sendMessage = sendMessage;
    }


    @Override
    public <T> Type<T> getType(HttpHeaders headers, T data) {
        Map<String, String> headerMap = headers.toSingleValueMap();


        Type<T> type = null;

        if ("1".equals(headerMap.get("Type"))) {
            type = new Type1<>(sendMessage);
        } else if ("2".equals(headerMap.get("Type"))) {
            type = new Type2<>(sendMessage);
        } else if ("3".equals(headerMap.get("Type"))) {
            type = new Type3<>(sendMessage);
        }

        Assert.notNull(type, "nono null");

        return type;
    }
}
