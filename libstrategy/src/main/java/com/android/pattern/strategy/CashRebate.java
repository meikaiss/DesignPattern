package com.android.pattern.strategy;

/**
 * Created by meikai on 15/11/11.
 */
public class CashRebate extends CashSuper {

    private float rebateRate = 1.0f;

    public CashRebate(float rebateRate) {
        if (rebateRate >= 0 && rebateRate < 1.0) {
            this.rebateRate = rebateRate;
        }
    }

    @Override
    float acceptCash(float money) {
        return money * rebateRate;
    }
}
