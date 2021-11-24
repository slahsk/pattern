package org.slahsk.pattern.type;

public class ExceptionType {

    public enum Type {
        BEFORE, AFTER, DEFAULT
    }

    public ExceptionType(NullPointerException exceptionType) {

    }


    private int httpStatusCode;
    private Type type;
    private Exception exception;

}
