package com.yigelusu.designpattern.singleton.hungry;

/**
 *〈一句话功能简述〉<br>
 *〈饿汉式单例模式线程安全〉
 * 这种方式线程安全，在HungrySingleton2类加载时，
 * 静态变量和静态代码块先初始化
 *
 * @author 一个鲁肃
 * @create 2018/8/3
 * @since 1.0.0
 */
public class HungrySingleton2 {

    private static HungrySingleton2 instance = null;

    static {
        instance = new HungrySingleton2();
    }

    private HungrySingleton2(){}

    public static HungrySingleton2 getInstance(){
        return instance;
    }

}
