package com.yigelusu.designpattern.factory.methodfactory;

import com.yigelusu.designpattern.factory.DaQiaoWeiJiu;
import com.yigelusu.designpattern.factory.Star;

/**
 *〈一句话功能简述〉<br>
 *〈大桥老师的生产工厂〉
 *
 * @author 一个鲁肃
 * @create 2018/8/2
 * @since 1.0.0
 */
public class DaQiaoWeiJiuFactory implements MethodFactory {

    @Override
    public Star getStar() {
        return new DaQiaoWeiJiu();
    }

}
