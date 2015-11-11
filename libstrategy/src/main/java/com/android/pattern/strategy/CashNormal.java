package com.android.pattern.strategy;

/**
 * Created by meikai on 15/11/11.
 */
public class CashNormal extends CashSuper {
    @Override
    float acceptCash(float money) {
        return money;
    }
}
