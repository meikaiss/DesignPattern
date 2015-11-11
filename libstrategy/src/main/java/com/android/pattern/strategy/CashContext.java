package com.android.pattern.strategy;

/**
 * Created by meikai on 15/11/11.
 */
public class CashContext {

    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public float getAcceptCash(float money){
        return cashSuper.acceptCash(money);
    }
}
