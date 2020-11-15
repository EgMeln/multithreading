package com.bsu.by;

import java.util.*;

class Main extends Thread {
    public int size;
    public int sortNumber;

    Main(int size, int sort) {
        this.size = size;
        this.sortNumber = sort;
    }

    public void start() {
        ArrayList<Integer> array = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array.add(i, rand.nextInt(100000));
        }
        System.out.println("Size: " + size);
        System.out.println("The original array");
        for (int i = 0; i < size; i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
        Sort sort = new Sort(size, sortNumber);
        sort.start();
        sort.run(array);
        System.out.println("The array after sort");
        for (int i = 0; i < size; i++) {
            System.out.print(array.get(i) + " ");
        }
    }
}













