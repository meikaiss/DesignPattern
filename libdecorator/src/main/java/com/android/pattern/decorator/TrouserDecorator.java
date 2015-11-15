package com.android.pattern.decorator;

import android.util.Log;

import java.util.List;

/**
 * Created by meikai on 15/11/15.
 */
public class TrouserDecorator extends PersonDecorator {

    @Override
    public void show(List<String> decoratorList) {
        Log.e("TShirtDecorator", "装饰上了裤子");
        decoratorList.add("装饰上了裤子");
        super.show(decoratorList);
    }
}
