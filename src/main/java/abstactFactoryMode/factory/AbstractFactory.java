package abstactFactoryMode.factory;

import abstactFactoryMode.Color;
import abstactFactoryMode.Shape;

/**
 * 抽象工厂
 *
 * 优点：
 * 1、抽象工厂模式隔离了具体类的生产，使得客户并不需要知道什么被创建。
 * 2、当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
 * 3、增加新的具体工厂和产品族很方便，无须修改已有系统，符合“开闭原则”。
 *
 * 缺点：
 * 增加新的产品等级结构很复杂，需要修改抽象工厂和所有的具体工厂类，对“开闭原则”的支持呈现倾斜性
 *
 * @author  liub 2018/5/14
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
