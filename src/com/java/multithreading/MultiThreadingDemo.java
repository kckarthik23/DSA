package com.java.multithreading;

public class MultiThreadingDemo {

    public static void parallelExecute(int low, int high, int numThreads) {
        if (numThreads <= 1) {
            printNum(low, high);
            return;
        }
        int mid = (low + high )/ 2;
        Thread thLower = createThread(low, mid, numThreads);
        Thread thHigher = createThread(mid, high, numThreads);
        thLower.setName("thLower");
        thHigher.setName("thHigher");
        thLower.start();
        thHigher.start();
        /* try {
            thLower.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
            
        }
        try {
            thHigher.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
        System.out.println(" main Thread is finished");
    }

    private static void printNum(int low, int high) {
        System.out.println("low is " + low + " high is " + high);
    }

    private static Thread createThread(int low, int high, int numThreads) {
        return new Thread() {
            public void run() {
              System.out.println(this.getName());
                parallelExecute(low, high, numThreads / 2);

            }
        };
    }
public static void main(String[] args) {
    int numThreads=4;//Runtime.getRuntime().availableProcessors();
   // System.out.println(numThreads);
    parallelExecute(0, 16, numThreads);
}
}
