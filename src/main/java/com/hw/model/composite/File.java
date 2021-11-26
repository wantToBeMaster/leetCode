package com.hw.model.composite;

/**
 * Created by huwei on 2021/11/26.
 */
public abstract class File {
    private String name;
    public File(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void display();
}
