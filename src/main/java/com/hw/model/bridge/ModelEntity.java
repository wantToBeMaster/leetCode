package com.hw.model.bridge;

/**
 * Created by huwei on 2021/11/25.
 */
public class ModelEntity extends ModelAbs{
    @Override
    void write() {
        super.getMethedInterface().write();
    }

    public ModelEntity(MethedInterface methedInterface){
        super.setMethedInterface(methedInterface);
    }
}
