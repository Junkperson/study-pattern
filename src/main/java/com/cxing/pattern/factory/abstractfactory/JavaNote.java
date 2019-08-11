package com.cxing.pattern.factory.abstractfactory;

/**
 * Java笔记
 * Created by Tom
 */
public class JavaNote implements INote {

    @Override
    public void edit() {
        System.out.println("编写Java笔记");
    }
}
