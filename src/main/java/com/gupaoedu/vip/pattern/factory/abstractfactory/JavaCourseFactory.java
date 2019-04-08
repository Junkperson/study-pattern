package com.gupaoedu.vip.pattern.factory.abstractfactory;

public class JavaCourseFactory implements CourseFactory{

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
