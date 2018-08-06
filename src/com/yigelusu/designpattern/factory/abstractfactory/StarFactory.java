package com.yigelusu.designpattern.factory.abstractfactory;

import com.yigelusu.designpattern.factory.CangJingKong;
import com.yigelusu.designpattern.factory.DaQiaoWeiJiu;
import com.yigelusu.designpattern.factory.Star;
import com.yigelusu.designpattern.factory.XiaoZeMaLiYa;

/**
 *〈一句话功能简述〉<br>
 *〈充气娃娃生产工厂类〉
 *
 * @author 一个鲁肃
 * @create 2018/8/3
 * @since 1.0.0
 */
public class StarFactory extends AbstractFactory {

    @Override
    public Star getCangJingKong() {
        return new CangJingKong();
    }

    @Override
    public Star getXiaoZeMaLiYa() {
        return new XiaoZeMaLiYa();
    }

    @Override
    public Star getDaQiaoWeiJiu() {
        return new DaQiaoWeiJiu();
    }

}
