package com.android.pattern.proxy;

/**
 * Created by meikai on 15/11/16.
 */
public class ProxyTest {

    public void testProxy(){

        RealSubject realSubject = new RealSubject();


        Proxy proxy = new Proxy();
        proxy.setRealSubject(realSubject);

        proxy.request();

    }

}
