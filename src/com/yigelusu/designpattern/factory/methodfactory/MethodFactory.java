package com.yigelusu.designpattern.factory.methodfactory;

import com.yigelusu.designpattern.factory.Star;

/**
 *〈一句话功能简述〉<br>
 *〈工厂方法〉
 *
 * @author 一个鲁肃
 * @create 2018/8/2
 * @since 1.0.0
 */
public interface MethodFactory {

    /**
     * 功能描述: <br>
     *〈该工厂必备的功能就是：生产娃娃〉
     */
    Star getStar();

}
