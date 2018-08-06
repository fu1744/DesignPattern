package com.yigelusu.designpattern.singleton.lazy;

/**
 *〈一句话功能简述〉<br>
 *〈双重校验锁单例模式线程安全〉
 *
 * 建议：推荐使用
 *
 * @author 一个鲁肃
 * @create 2018/8/3
 * @since 1.0.0
 */
public class LazySingleton4 {

    private static volatile LazySingleton4 instance = null;

    private LazySingleton4(){}

    public static LazySingleton4 getInstance(){
        if (instance == null){
            synchronized (LazySingleton4.class){
                if (instance == null){
                    instance = new LazySingleton4();
                }
            }
        }
        return instance;
    }

}
