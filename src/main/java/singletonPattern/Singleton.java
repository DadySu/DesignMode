package singletonPattern;

/**
 * 单例模式
 * 保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 *  需要注意：：判断系统是否已经有这个单例，如果有则返回，如果没有则创建；构造函数是私有的。
 */
public class Singleton {

    private static Singleton instance = new Singleton();
    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton instance =  Singleton.getInstance();
    }
}
