package com.android.pattern.libcalculater;

/**
 * Created by meikai on 15/11/9.
 */
public class SubOpration extends Operation {
    @Override
    public int operat() {
        return getNumber1() - getNumber2();
    }
}
