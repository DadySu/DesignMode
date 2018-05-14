package abstactFactoryMode.impl;

import abstactFactoryMode.Shape;

/**
 *圆形实现类
 * @author liub 2018/5/14
 */
public class Circle implements Shape {
    public void draw() {
        System.out.println("Circle.draw");
    }
}
