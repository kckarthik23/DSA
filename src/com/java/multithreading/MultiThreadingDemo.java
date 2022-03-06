package com.java.multithreading;

public class MultiThreadingDemo {

    public static void parallelExecute(int arr[], int low, int high, int numThreads) {
        int mid = low + (high - low) / 2;

        if (numThreads <= 1) {
            merge(arr, mid, low, high);
            return;
        }
        Thread thLower = createThread(arr, low, mid, numThreads);
        Thread thHigher = createThread(arr, mid + 1, high, numThreads);
        thLower.setName("thLower");
        thHigher.setName("thHigher");
        thLower.start();
        thHigher.start();
        /*
         * try {
         * thLower.join();
         * } catch (InterruptedException e) {
         * // TODO Auto-generated catch block
         * e.printStackTrace();
         * 
         * 
         * }
         * try {
         * thHigher.join();
         * } catch (InterruptedException e) {
         * // TODO Auto-generated catch block
         * e.printStackTrace();
         * }
         */
       // System.out.println(" main Thread is finished");
    }

    private static void merge(int arr[], int mid, int low, int high) {
        int temp[] = new int[high - low + 1];
        for (int i = 0; i <= high - low; i++)
            temp[i] = arr[low + i];

        int i = 0;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (temp[i] > temp[j]) {
                arr[i + low] = temp[j];
                j++;
            } else {
                arr[i + low] = temp[i];
                i++;
            }
            k++;
        }

        while (i <= mid) {
            arr[i + low] = temp[i];
        }

        while (j <= high) {
            arr[j] = temp[j];
        }

    }

    private static Thread createThread(int arr[], int low, int high, int numThreads) {
        return new Thread() {
            public void run() {
                System.out.println(this.getName());
                parallelExecute(arr, low, high, numThreads / 2);

            }
        };
    }

    public static void main(String[] args) {
        int numThreads = 4;// Runtime.getRuntime().availableProcessors();
        // System.out.println(numThreads);
        int arr[] = { 9, 5, 0, 6, 1, 7, 2, 4, 8, 3 };
        parallelExecute(arr, 0, arr.length - 1, numThreads);
        for(int val:arr)
        System.out.println(val);
    }
}
