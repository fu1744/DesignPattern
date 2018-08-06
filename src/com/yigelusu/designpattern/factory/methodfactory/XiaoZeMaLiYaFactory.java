package com.yigelusu.designpattern.factory.methodfactory;

import com.yigelusu.designpattern.factory.Star;
import com.yigelusu.designpattern.factory.XiaoZeMaLiYa;

/**
 *〈一句话功能简述〉<br>
 *〈小泽老师的生产工厂〉
 *
 * @author 一个鲁肃
 * @create 2018/8/2
 * @since 1.0.0
 */
public class XiaoZeMaLiYaFactory implements MethodFactory {

    @Override
    public Star getStar() {
        return new XiaoZeMaLiYa();
    }

}
