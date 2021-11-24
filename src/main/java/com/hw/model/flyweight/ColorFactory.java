package com.hw.model.flyweight;

import java.util.HashMap;

/**
 * Created by huwei on 2021/11/24.
 */
public class ColorFactory {
    private static final HashMap<String, ColorModel> map= new HashMap<>();

    public static ColorModel getColor(String color){
        ColorModel model = map.get(color);
        if (model == null){
            model = new ColorModel(color);
            map.put(color,model);
        }
        return model;
    }
}
