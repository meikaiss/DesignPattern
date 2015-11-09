package com.android.pattern.libcalculater;

/**
 * Created by meikai on 15/11/9.
 */
public class DivOperation extends Operation {
    @Override
    public int operat() {
        if (getNumber2() == 0) {
            return getNumber1() >= 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return getNumber1() / getNumber2();
    }
}
