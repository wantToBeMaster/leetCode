package com.hw.model.bridge;

/**
 * Created by huwei on 2021/11/25.
 */
public abstract class ModelAbs{
    private MethedInterface methedInterface;

    public MethedInterface getMethedInterface() {
        return methedInterface;
    }

    public void setMethedInterface(MethedInterface methedInterface) {
        this.methedInterface = methedInterface;
    }

    abstract void write();
}
