package com.hw.model.composite;

/**
 * 组合模式：
 * 部分-整体 的结构  树形结构  类里面包含自身的集合
 * 常用于文件结构等适用树形结构的地方
 * Created by huwei on 2021/11/26.
 */
public class ComponentDemo {

    public static void main(String[] args) {
        Folder root = new Folder("root");
        Folder hw = new Folder("hw");
        File imgFile1 = new ImgFile("img1.png");
        File imgFile2 = new ImgFile("img2.png");
        TextFile textFile1 = new TextFile("t1.txt");
        TextFile textFile2 = new TextFile("t2.txt");
        root.add(textFile1);
        root.add(imgFile1);
        root.add(hw);
        hw.add(imgFile2);
        hw.add(textFile2);
        root.display();

    }
}
