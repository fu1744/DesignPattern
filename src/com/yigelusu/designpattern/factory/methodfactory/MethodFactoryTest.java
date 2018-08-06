package com.yigelusu.designpattern.factory.methodfactory;

/**
 *〈一句话功能简述〉<br>
 *〈方法工厂的测试类〉
 *
 * @author 一个鲁肃
 * @create 2018/8/2
 * @since 1.0.0
 */
public class MethodFactoryTest {

    public static void main(String[] args) {
        //TODO
        MethodFactory factory = new CangJingKongFactory();
        System.out.println(factory.getStar());

    }

}
