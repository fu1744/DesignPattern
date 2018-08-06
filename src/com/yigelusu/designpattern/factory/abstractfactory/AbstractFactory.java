package com.yigelusu.designpattern.factory.abstractfactory;

import com.yigelusu.designpattern.factory.Star;

/**
 *〈一句话功能简述〉<br>
 *〈抽象工厂类〉
 *
 * @author 一个鲁肃
 * @create 2018/8/2
 * @since 1.0.0
 */
public abstract class AbstractFactory {


    public abstract Star getCangJingKong();

    public abstract Star getXiaoZeMaLiYa();

    public abstract Star getDaQiaoWeiJiu();


}
