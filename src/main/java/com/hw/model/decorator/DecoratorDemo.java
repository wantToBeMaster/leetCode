package com.hw.model.decorator;

/**
 * 装饰器模式：
 * 通过接口类实现类型嵌套，可以对接口中的方法进行动态拓展
 *
 * Created by huwei on 2021/11/25.
 */
public class DecoratorDemo {

    public static void main(String[] args) {

        BaseInterfaceImpl baseInterface = new BaseInterfaceImpl();

        DecoratorModel1 decoratorModel1 = new DecoratorModel1();
        decoratorModel1.setBaseInterface(baseInterface);

        DecoratorModel2 decoratorModel2 = new DecoratorModel2();
        decoratorModel2.setBaseInterface(decoratorModel1);

        decoratorModel2.doSomeThing();
    }
}
