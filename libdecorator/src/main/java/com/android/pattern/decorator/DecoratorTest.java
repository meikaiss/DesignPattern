package com.android.pattern.decorator;

import java.util.List;

/**
 * Created by meikai on 15/11/15.
 */
public class DecoratorTest {

    public void testDecorator(List<String> decoratorList){

        Person person = new Person("梅凯");

        TShirtDecorator tShirtDecorator = new TShirtDecorator();
        TrouserDecorator trouserDecorator = new TrouserDecorator();

        tShirtDecorator.decorate(person);
        trouserDecorator.decorate(tShirtDecorator);


        trouserDecorator.show(decoratorList);
    }


}
