package com.cxing.pattern.factory.abstractfactory;


/**
 * Created by Tom on.
 */
public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制Java视频");
    }
}
