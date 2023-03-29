package top.vita;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static java.lang.Thread.sleep;

/**
 * @Author vita
 * @Date 2023/3/29 22:32
 */
public class CompletableFutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> completableFuture = new CompletableFuture<>();
        new Thread(() -> {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            completableFuture.complete(1);
            completableFuture.complete(2);
        }).start();
        System.out.println("阻塞...");
        System.out.println(completableFuture.get());
    }
}
