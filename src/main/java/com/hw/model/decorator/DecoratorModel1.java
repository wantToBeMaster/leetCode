package com.hw.model.decorator;

/**
 * Created by huwei on 2021/11/25.
 */
public class DecoratorModel1 extends DecoratorBaseModel{
    @Override
    public void doSomeThing() {
        System.out.println("after do something1 ...");
        this.getBaseInterface().doSomeThing();
    }
}
