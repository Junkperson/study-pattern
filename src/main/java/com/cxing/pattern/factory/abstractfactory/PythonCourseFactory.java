package com.cxing.pattern.factory.abstractfactory;

/**
 * Created by Tom.
 */
public class PythonCourseFactory implements CourseFactory {

    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
