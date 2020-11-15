package com.bsu.by;

import java.util.Scanner;

class Process {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size = scanner.nextInt();
            System.out.println("Enter the sort type:");
            System.out.println("1. Decreasing by value");
            System.out.println("2. The increase in value");
            System.out.println("3. Descending by the numbers");
            System.out.println("4. The increase by the numbers");
            int sortType = scanner.nextInt();
            Main start = new Main(size, sortType);
            start.start();
        }

    }
}
