package top.vita;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author vita
 * @Date 2023/3/22 16:31
 */
public class Test {
    public static void main(String[] args) throws IOException {
//        Integer[] arr = {1, 2, 3};
//        List<Integer> collect = Arrays.stream(arr).collect(Collectors.toList());
//        int[] arr1 = {1, 2, 3};
//        long count = Arrays.stream(arr1).boxed().count();
//        System.out.println(count);

        Writer output = new FileWriter("output.txt");
        output.write("你好，我是。");
        output.flush();
    }
}
