package com.android.pattern.proxy;

/**
 * Created by meikai on 15/11/16.
 */
public class Proxy implements ISubject {

    private RealSubject realSubject;

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        realSubject.request();
    }
}
