package com.android.pattern.proxy;

import java.util.List;

/**
 * Created by meikai on 15/11/16.
 */
public class ProxyTest {

    public void testProxy(List<String> list){

        RealSubject realSubject = new RealSubject();


        Proxy proxy = new Proxy();
        proxy.setRealSubject(realSubject);

        proxy.request(list);

    }

}
