package com.yigelusu.designpattern.factory.simplefactory;

import com.yigelusu.designpattern.factory.CangJingKong;
import com.yigelusu.designpattern.factory.DaQiaoWeiJiu;
import com.yigelusu.designpattern.factory.Star;
import com.yigelusu.designpattern.factory.XiaoZeMaLiYa;

/**
 *〈一句话功能简述〉<br>
 *〈简单工厂模式〉
 *
 * @author 一个鲁肃
 * @create 2018/8/2
 * @since 1.0.0
 */
public class SimpleFactory {

    /**
     * 功能描述: <br>
     * 〈首先声明这个工厂是生产充气娃娃的工厂类〉
     *
     * @param：name
     * @return: Star
     */
    public Star getStar(String name){
        if ("苍井空".equals(name)){
            return new CangJingKong();
        }else if ("小泽玛利亚".equals(name)){
            return new XiaoZeMaLiYa();
        }else if ("大桥未久".equals(name)){
            return new DaQiaoWeiJiu();
        }else {
            System.out.println("这个产品我们还没办法生产~~");
            return null;
        }
    }

}
