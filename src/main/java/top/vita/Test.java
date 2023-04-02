package top.vita;

import cn.hutool.core.lang.copier.Copier;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author vita
 * @Date 2023/3/22 16:31
 */
public class Test {
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
//        Integer[] arr = {1, 2, 3};
//        List<Integer> collect = Arrays.stream(arr).collect(Collectors.toList());
//        int[] arr1 = {1, 2, 3};
//        long count = Arrays.stream(arr1).boxed().count();
//        System.out.println(count);

//        Writer output = new FileWriter("output.txt");
//        output.write("你好，我是。");
//        output.flush();

//        FutureTask<Object> objectFutureTask = new FutureTask<>(() -> "test");
//        objectFutureTask.run();
//
//        FutureTask<Object> objectFutureTask2 = new FutureTask<>(() -> "test2");
//        objectFutureTask.run();

//        new ArrayDeque<>().add(null);

//        Integer integer1 = Integer.valueOf(1024);
//        Integer integer2 = Integer.valueOf(1024);
//        System.out.println(integer1 == integer2);
//        integer2.intValue();

//        test();

//        List<Integer> list = Arrays.asList(1, 2, 3);
//        list.forEach(System.out::println);
//        System.out.println("list.stream().mapToInt(i -> i).summaryStatistics().getMax() = " + list.stream().mapToInt(i -> i).summaryStatistics().getMax());
//        Stream<Integer> stream = list.stream();
//        stream.limit(1);
//        stream.limit(1);
//        list.parallelStream().forEach(System.out::println);




    }

    public static String test() {
        String s = "test";
        s = s.substring(2);
        return s;
    }
}
