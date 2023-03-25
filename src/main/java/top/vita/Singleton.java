package top.vita;

/**
 * @Author vita
 * @Date 2023/3/25 10:17
 */
public class Singleton {

    private volatile static Singleton instance;

    public Singleton() {
    }

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
