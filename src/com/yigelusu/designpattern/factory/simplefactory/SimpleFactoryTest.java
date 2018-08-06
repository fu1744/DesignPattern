package com.yigelusu.designpattern.factory.simplefactory;

import com.yigelusu.designpattern.factory.CangJingKong;

/**
 *〈一句话功能简述〉<br>
 *〈简单工厂测试类〉
 *
 * @author 一个鲁肃
 * @create 2018/8/2
 * @since 1.0.0
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        //此时你饥渴难耐，自己制作一个娃娃
        System.out.println(new CangJingKong().getName());
        //那么充气娃娃的制作并没有那么容易，你花费了一天的时间制作出来了，结果困了，睡着了.......
        //只要有钱，你就不用去制作了，花钱买一个就ok了
        SimpleFactory simpleFactory = new SimpleFactory();

        //把你想要的明星娃娃跟工厂说一声，就好了
        //工厂对外隐藏了生产的实现细节
        System.out.println(simpleFactory.getStar("苍井空").getName());

    }

}
