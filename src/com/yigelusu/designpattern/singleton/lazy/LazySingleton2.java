package com.yigelusu.designpattern.singleton.lazy;

/**
 *〈一句话功能简述〉<br>
 *〈懒汉式单例模式线程安全〉
 * 类加载时，并没有对instance实例进行初始化，
 * 当调用getInstance方法时，才进行instance的初始化，从而达到了懒加载
 *
 * @author 一个鲁肃
 * @create 2018/8/3
 * @since 1.0.0
 */
public class LazySingleton2 {

    private static LazySingleton2 instance = null;

    private LazySingleton2(){}

    public static synchronized LazySingleton2 getInstance(){
        if (instance == null){
            instance = new LazySingleton2();
        }
        return instance;
    }

}
