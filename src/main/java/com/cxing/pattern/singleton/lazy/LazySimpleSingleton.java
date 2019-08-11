package com.cxing.pattern.singleton.lazy;

public class LazySimpleSingleton {

    private static LazySimpleSingleton lazy=null;

    public LazySimpleSingleton(){}

    public synchronized static LazySimpleSingleton getInstance(){
        if(lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

}
