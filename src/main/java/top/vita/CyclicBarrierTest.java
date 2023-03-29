package top.vita;

import java.util.concurrent.*;

import static java.lang.Thread.sleep;

/**
 * @Author vita
 * @Date 2023/3/29 21:26
 */
public class CyclicBarrierTest {
    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(5, () -> {
        System.out.println("足够的线程到达屏障，开始执行...");
    });

    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            sleep(500);
            int threadNum = i;
            threadPool.execute(()->{
                try {
                    test(threadNum);
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            });
        }
        threadPool.shutdown();
    }

    private static void test(int i) throws InterruptedException, BrokenBarrierException {
        System.out.println("i: " + i + " ready");
        cyclicBarrier.await();
        System.out.println("i: " + i + " finish");
    }
}
