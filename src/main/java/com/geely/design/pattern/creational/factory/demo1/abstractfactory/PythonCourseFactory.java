package com.geely.design.pattern.creational.factory.demo1.abstractfactory;

/**
 * Created by geely
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
