package com.hw.model.flyweight;

/**
 * Created by huwei on 2021/11/24.
 */
public class ColorModel {
    private String color;

    @Override
    public String toString() {
        return "ColorModel{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    private String size;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ColorModel(String color){
        this.color = color;
    }

}
