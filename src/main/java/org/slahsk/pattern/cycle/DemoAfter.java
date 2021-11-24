package org.slahsk.pattern.cycle;

import org.slahsk.pattern.model.DemoResult;

import java.util.function.Function;

public class DemoAfter<T, U> implements After<T, U> {
    @Override
    public Type2Next<T, U> type2(String code) {
        return null;
    }

    @Override
    public Type3Next<T, U> type3() {
        return null;
    }

    @Override
    public After<T, U> onServiceException() {
        return null;
    }

    @Override
    public After<T, U> onService() {
        return null;
    }

    @Override
    public DemoResult result() {
        return null;
    }

    private class DemoTpye2Next implements Type2Next {

        @Override
        public After next(Function next) {
            return null;
        }
    }


    private class DemoType3Next implements Type3Next {

        @Override
        public After next(Function next) {
            return null;
        }
    }
}
