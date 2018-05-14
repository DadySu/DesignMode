package abstactFactoryMode.impl;

import abstactFactoryMode.Shape;

/**
 * 矩形实现类
 * @author liub 2015/5/10
 */
public class Rectangle implements Shape {
    public void draw() {
        System.out.println("Rectangle.draw");
    }
}
