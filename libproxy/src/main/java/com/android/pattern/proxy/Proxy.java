package com.android.pattern.proxy;

import android.util.Log;

import java.util.List;

/**
 * Created by meikai on 15/11/16.
 */
public class Proxy implements ISubject {

    private RealSubject realSubject;

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request(List<String> list) {

        list.add("代理类处理另外一些事务，如调用权限验证、引用次数统计等");
        Log.e("RealSubject", "代理类处理另外一些事务，如调用权限验证、引用次数统计等");
        realSubject.request(list);
    }
}
