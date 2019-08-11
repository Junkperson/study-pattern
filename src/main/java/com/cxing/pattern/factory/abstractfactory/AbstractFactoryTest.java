package com.cxing.pattern.factory.abstractfactory;

/**
 * Created by Tom.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        CourseFactory factory = new JavaCourseFactory();
        factory.createNote().edit();
        factory.createVideo().record();
        factory = new JavaCourseFactory();
        factory.createNote().edit();
        factory.createVideo().record();
    }

}
