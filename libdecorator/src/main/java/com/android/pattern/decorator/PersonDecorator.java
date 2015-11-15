package com.android.pattern.decorator;

/**
 * Created by meikai on 15/11/15.
 */
public abstract class PersonDecorator extends Person {

    protected Person person;

    public void decorate(Person person){

        this.person = person;
    }

    @Override
    public void show() {
        if (person!=null)
            person.show();
    }

}
