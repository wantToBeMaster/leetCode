package com.hw.model.decorator;

/**
 * Created by huwei on 2021/11/25.
 */
public class DecoratorModel2 extends DecoratorBaseModel{
    @Override
    public void doSomeThing() {
        System.out.println("after do something2 ...");
        this.getBaseInterface().doSomeThing();
    }
}
