package com.cxing.pattern.factory.factorymethod;

import com.cxing.pattern.factory.ICourse;
import com.cxing.pattern.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory  {


    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
