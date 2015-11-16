package com.android.pattern.proxy;

import android.util.Log;

import java.util.List;

import javax.security.auth.Subject;

/**
 * Created by meikai on 15/11/16.
 */
public class RealSubject implements ISubject {

    @Override
    public void request(List<String> list) {
        list.add("真实主体执行内务处理");
        Log.e("RealSubject", "真实主体执行内务处理");

    }

}
