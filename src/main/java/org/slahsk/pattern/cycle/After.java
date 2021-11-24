package org.slahsk.pattern.cycle;

import org.slahsk.pattern.model.DemoResult;

public interface After<T, U> {

    Type2Next<T, U> type2(String code);

    Type3Next<T, U> type3();

    After<T, U> onServiceException();

    After<T, U> onService();


    DemoResult result();

}
