package com.hw.model.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huwei on 2021/11/26.
 */
public class Folder extends File{

    private List<File> files;

    public Folder(String name) {
        super(name);
        files = new ArrayList<>();
    }

    public void add(File file) {
        files.add(file);
    }

    @Override
    public void display() {
        System.out.println("文件夹名称："+super.getName());
        for (File file : files) {
            file.display();
        }
    }
}
