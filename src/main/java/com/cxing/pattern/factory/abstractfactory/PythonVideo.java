package com.cxing.pattern.factory.abstractfactory;

/**
 * Created by Tom.
 */
public class PythonVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制Python视频");
    }
}
