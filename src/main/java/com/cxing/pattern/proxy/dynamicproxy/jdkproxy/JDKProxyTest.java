package com.cxing.pattern.proxy.dynamicproxy.jdkproxy;

import com.cxing.pattern.proxy.Person;

/**
 * Created by Tom on 2019/3/10.
 */
public class JDKProxyTest {

    public static void main(String[] args) {
        try {

            Person obj = (Person)new JDKMeipo().getInstance(new Girl());
//            Method method = obj.getClass().getMethod("findLove",null);
//            method.invoke(obj);
            obj.findLove();

            //obj.findLove();

            //$Proxy0
//            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
//            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
//            os.write(bytes);
//            os.close();

        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
