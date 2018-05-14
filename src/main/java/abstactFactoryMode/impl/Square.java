package abstactFactoryMode.impl;

import abstactFactoryMode.Shape;

/**
 *  正方形实现类
 * @author liub 2018/5/10
 */
public class Square implements Shape {
    public void draw() {
        System.out.println("Square.draw");
    }
}
