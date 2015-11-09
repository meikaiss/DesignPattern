package com.android.pattern.libcalculater;

/**
 * Created by meikai on 15/11/9.
 */
public class OperatonFactory {


    public static Operation createOperation(String operateSymbol) throws RuntimeException{

        Operation operation = null;
        switch (operateSymbol){
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubOpration();
                break;
            case "*":
                operation = new MulOperation();
                break;
            case "/":
                operation = new DivOperation();
                break;
            default:
                throw new RuntimeException("not recognize operation symbol");
        }

        return operation;
    }
}
