package com.hw.model.bridge;


/**
 * 桥接模式：
 * 特点：把对象的部分方法进行抽象，通过创建接口类的方式进行动态赋值。
 * 优点：结构灵活。
 * 缺点：代码阅读难度高，复杂度高。
 * Created by huwei on 2021/11/25.
 */
public class BridgeDemo {
    public static void main(String[] args) {
        ModelEntity modelEntity = new ModelEntity(new MethedImpl1());
        modelEntity.write();

        modelEntity.setMethedInterface(new MethedImpl2());
        modelEntity.write();
    }
}
