package com.hw.model.decorator;

/**
 * Created by huwei on 2021/11/25.
 */
public abstract class DecoratorBaseModel implements BaseInterface {
    private BaseInterface baseInterface;

    public BaseInterface getBaseInterface() {
        return baseInterface;
    }

    public void setBaseInterface(BaseInterface baseInterface) {
        this.baseInterface = baseInterface;
    }

    public abstract void doSomeThing();
}
