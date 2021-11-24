package com.hw.model.flyweight;


/**
 * 享元模式：
 * 缓存已创建的示例，并可以通过外部标识进行重复获取，以节省内存，提高使用效率。
 * 核心点在于实例的可共享部分作为标识，正确区分可共享部分。
 * 不可共享部分交由使用者进行赋值更改。
 * ！！！重复使用的实例，在对不可共享部分未赋值时，会带有上次使用的值，
 * 且当多处同时获取相同一个享元示例时，更改外部状态会发生冲突。
 * 实用示例：线程池
 * Created by huwei on 2021/11/24.
 */
public class FlyWeightDemo {
    public static void main(String[] args) {
        ColorModel black = ColorFactory.getColor("black");
        black.setSize("3");
        System.out.println(black.toString());
        ColorModel red = ColorFactory.getColor("red");
        red.setSize("4");
        System.out.println(red.toString());
        ColorModel black2 = ColorFactory.getColor("black");
        black2.setSize("5");
        System.out.println(black2.toString());
        //第二个black实例更改外部状态后，第一个black实例也随之改变
        System.out.println(black.toString());

        String s = new String("");
        Integer integer = new Integer(1);
    }
}
