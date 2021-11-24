package org.slahsk.pattern.cycle;

import org.slahsk.pattern.model.DemoResult;
import org.slahsk.pattern.type.Type;

public class DefaultCycle<T, U> {
    private Type<T> type;
    private DemoBefore<T> demoBefore;
    private DemoService<T> demoService;
    private DemoAfter<T, U> demoAfter;


    public DefaultCycle() {
        this.type = null;
        this.demoBefore = null;
        this.demoService = null;
        this.demoAfter = null;
    }


    private viod process() {

        try {
            demoService.service();
        } catch (Exception ex) {
            demoAfter.onServiceException();
        } finally {
            demoAfter.onService();

        }


    }


    public DemoResult get() {


        return type.getResult();
    }


}
