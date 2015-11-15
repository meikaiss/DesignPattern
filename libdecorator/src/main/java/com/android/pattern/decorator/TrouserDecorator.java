package com.android.pattern.decorator;

import android.util.Log;

/**
 * Created by meikai on 15/11/15.
 */
public class TrouserDecorator extends PersonDecorator {

    @Override
    public void show() {
        Log.e("TShirtDecorator", "装饰上了裤子");
        super.show();
    }
}
