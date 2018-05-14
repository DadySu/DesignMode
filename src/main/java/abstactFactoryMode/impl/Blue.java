package abstactFactoryMode.impl;

import abstactFactoryMode.Color;

/**
 * 蓝色实现类
 * @author liub 2018/5/14
 */
public class Blue implements Color {
    public void fill() {
        System.out.println("Blue.fill");
    }
}
