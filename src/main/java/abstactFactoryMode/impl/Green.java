package abstactFactoryMode.impl;

import abstactFactoryMode.Color;

/**
 * 绿色实现类
 * @author liub 2018/5/14
 */
public class Green implements Color {
    public void fill() {
        System.out.println("Green.fill");
    }
}
