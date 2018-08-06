package com.yigelusu.designpattern.singleton.hungry;

/**
 *〈一句话功能简述〉<br>
 *〈饿汉式单例模式线程安全〉
 * 这种方式线程安全，在HungrySingleton1类加载时，
 * 静态变量和静态代码块先初始化
 *
 * @author 一个鲁肃
 * @create 2018/8/3
 * @since 1.0.0
 */
public class HungrySingleton1 {

    private static HungrySingleton1 instance = new HungrySingleton1();

    private HungrySingleton1(){}

    public static HungrySingleton1 getInstance(){
        return instance;
    }

}
