package com.geely.design.pattern.creational.factory.demo1.simplefactory;

/**
 * Created by geely
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
