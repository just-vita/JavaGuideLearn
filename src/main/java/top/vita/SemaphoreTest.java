package top.vita;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @Author vita
 * @Date 2023/3/29 21:26
 */
public class SemaphoreTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(30);
        Semaphore semaphore = new Semaphore(20);
        for (int i = 0; i < 100; i++) {
            int threadNum = i;
            threadPool.execute(()->{
                try {
                    semaphore.acquire();
                    test(threadNum);
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        threadPool.shutdown();
        System.out.println("finish");
    }

    private static void test(int i) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("i: " + i);
        Thread.sleep(1000);
    }
}
