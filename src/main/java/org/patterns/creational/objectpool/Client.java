package org.patterns.creational.objectpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {


    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();

        service.submit(() -> System.out.println(Thread.currentThread().getName()));
        service.submit(() -> System.out.println(Thread.currentThread().getName()));
        service.submit(() -> System.out.println(Thread.currentThread().getName()));

        service.shutdown();
    }
}
