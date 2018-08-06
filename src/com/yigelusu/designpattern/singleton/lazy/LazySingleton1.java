package com.yigelusu.designpattern.singleton.lazy;

/**
 *〈一句话功能简述〉<br>
 *〈懒汉式单例模式线程不安全〉
 * 类加载时，并没有对instance实例进行初始化，
 * 当调用getInstance方法时，才进行instance的初始化，从而达到了懒加载
 *
 * 建议：不推荐健使用
 *
 * @author 一个鲁肃
 * @create 2018/8/3
 * @since 1.0.0
 */
public class LazySingleton1 {

    private static LazySingleton1 instance = null;

    private LazySingleton1(){}

    public static LazySingleton1 getInstance(){
        if (instance == null){
            instance = new LazySingleton1();
        }
        return instance;
    }

}
