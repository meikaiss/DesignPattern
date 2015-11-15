package com.android.pattern.decorator;

import android.util.Log;

/**
 * Created by meikai on 15/11/15.
 */
public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }


    public void show(){

        StringBuilder sb = new StringBuilder();
        sb.append("经过装饰后的").append(name);

        Log.e("Person", sb.toString());
    }


}
