package com.yigelusu.designpattern.singleton.lazy;

/**
 *〈一句话功能简述〉<br>
 *〈静态内部类单例模式线程安全〉
 *  建议：推荐使用
 *
 * @author 一个鲁肃
 * @create 2018/8/3
 * @since 1.0.0
 */
public class LazySingleton5 {

    private LazySingleton5(){}

    /**
     * 功能描述: <br>
     *〈静态内部类〉
     */
    private static class SingletonInstance {
        private static final LazySingleton5 INSTANCE = new LazySingleton5();
    }

    public static LazySingleton5 getInstance(){
        return SingletonInstance.INSTANCE;
    }


}
