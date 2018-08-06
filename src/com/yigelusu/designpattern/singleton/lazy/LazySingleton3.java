package com.yigelusu.designpattern.singleton.lazy;

/**
 *〈一句话功能简述〉<br>
 *〈懒汉式单例模式〉
 * 同步代码块的方式，线程安全，但有可能会产生多个实例
 *
 * 建议：不推荐使用
 *
 * @author 一个鲁肃
 * @create 2018/8/3
 * @since 1.0.0
 */
public class LazySingleton3 {

    private static LazySingleton3 instance = null;

    private LazySingleton3(){}

    public static LazySingleton3 getInstance(){
        if (instance == null){
            synchronized (LazySingleton3.class){
                if (instance == null){
                    instance = new LazySingleton3();
                }
            }
        }
        return instance;
    }

}
