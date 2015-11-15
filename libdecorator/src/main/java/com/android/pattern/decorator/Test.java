package com.android.pattern.decorator;

/**
 * Created by meikai on 15/11/15.
 */
public class Test {

    public void testDecorator(){

        Person person = new Person("梅凯");

        TShirtDecorator tShirtDecorator = new TShirtDecorator();
        TrouserDecorator trouserDecorator = new TrouserDecorator();

        tShirtDecorator.decorate(person);
        trouserDecorator.decorate(tShirtDecorator);


        trouserDecorator.show();
    }


}
