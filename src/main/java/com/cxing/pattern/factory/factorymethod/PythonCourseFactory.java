package com.cxing.pattern.factory.factorymethod;

import com.cxing.pattern.factory.PythonCourse;
import com.cxing.pattern.factory.ICourse;

public class PythonCourseFactory implements ICourseFactory  {


    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
