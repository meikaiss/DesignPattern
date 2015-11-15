package com.android.pattern.decorator;

import android.util.Log;

import java.util.List;

/**
 * Created by meikai on 15/11/15.
 */
public class TShirtDecorator extends PersonDecorator {


    @Override
    public void show(List<String> decoratorList) {
        Log.e("TShirtDecorator", "装饰上了T恤");
        decoratorList.add("装饰上了T恤");
        super.show(decoratorList);
    }
}
