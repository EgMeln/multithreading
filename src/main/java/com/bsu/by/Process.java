package com.bsu.by;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size = scanner.nextInt();
            ArrayList<Integer> array = new ArrayList<>();
            Random rand = new Random();
            for (int i = 0; i < size; i++) {
                array.add(i, rand.nextInt(1000));
            }
            System.out.println("Size: " + size);
            System.out.println("The original array");
            for (int i = 0; i < size; i++) {
                System.out.print(array.get(i) + " ");
            }
            System.out.println();
            System.out.println("Enter the sort type:");
            System.out.println("1. Decreasing by value");
            System.out.println("2. The increase in value");
            System.out.println("3. Descending by the numbers");
            System.out.println("4. The increase by the numbers");
            int sortType = scanner.nextInt();
            Sort sort = new Sort(sortType);
            sort.join();
            sort.start();
            sort.run(array);
            System.out.println("The array after sort");
            for (int i = 0; i < size; i++) {
                System.out.print(array.get(i) + " ");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
