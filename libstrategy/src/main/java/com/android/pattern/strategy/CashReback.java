package com.android.pattern.strategy;

/**
 * Created by meikai on 15/11/11.
 * 满三百减一
 */
public class CashReback extends CashSuper {

    private float arrive;
    private float divide;

    public CashReback(float arrive, float divide) {
        this.arrive = arrive;
        this.divide = divide;
    }

    @Override
    float acceptCash(float money) {
        if (money >= arrive)
            money -= divide;
        return money;
    }
}
