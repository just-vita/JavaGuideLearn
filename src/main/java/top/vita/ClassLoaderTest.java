package top.vita;

/**
 * @Author vita
 * @Date 2023/4/1 19:51
 */
public class ClassLoaderTest extends ClassLoader{

    /**
     * 如果我们不想打破双亲委派模型，就重写 ClassLoader 类中的 findClass() 方法即可
     * 无法被父类加载器加载的类最终会通过这个方法被加载。
     */
    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return super.loadClass(name);
    }

    /**
     * 如果想打破双亲委派模型则需要重写 loadClass() 方法。
     */
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}
