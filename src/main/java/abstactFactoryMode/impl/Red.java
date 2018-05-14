package abstactFactoryMode.impl;

import abstactFactoryMode.Color;

/**
 * 红色实现类
 * @author liub 2018/5/14
 */
public class Red implements Color {
    public void fill() {
        System.out.println("Red.fill");
    }
}
