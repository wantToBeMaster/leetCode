package com.hw.model.composite;

/**
 * Created by huwei on 2021/11/26.
 */
public class TextFile extends File{
    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("TextFileName:"+super.getName());
    }
}
