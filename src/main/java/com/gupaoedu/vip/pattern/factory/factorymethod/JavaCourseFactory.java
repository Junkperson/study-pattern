package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.ICourse;
import com.gupaoedu.vip.pattern.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory  {


    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
