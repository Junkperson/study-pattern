package com.cxing.pattern.proxy.staticproxy;

import com.cxing.pattern.proxy.Person;

/**
 * Created by Tom on 2019/3/10.
 */
public class Son implements Person {

    @Override
    public void findLove(){
        System.out.println("儿子要求：肤白貌美大长腿");
    }

    public void findJob(){

    }

    public void eat(){

    }

}
