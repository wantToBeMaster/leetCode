package com.hw.model.composite;

/**
 * Created by huwei on 2021/11/26.
 */
public class ImgFile extends File{
    public ImgFile(String name) {
        super(name);
    }


    @Override
    public void display() {
        System.out.println("ImgFileName:"+super.getName());
    }
}
