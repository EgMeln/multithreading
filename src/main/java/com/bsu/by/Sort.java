package com.bsu.by;

import java.util.ArrayList;

class Sort extends Thread {
    public int size;
    public int sortNumber;

    public Sort(int size, int sortNumber) {
        this.size = size;
        this.sortNumber = sortNumber;
    }

    public void run(ArrayList<Integer> array) {
        switch (sortNumber) {
            case 1:
                Comparators.minInt firstSort = new Comparators.minInt();
                array.sort(firstSort);
                break;
            case 2:
                Comparators.maxInt secondSort = new Comparators.maxInt();
                array.sort(secondSort);
                break;
            case 3:
                Comparators.minMeet thirdSort = new Comparators.minMeet();
                array.sort(thirdSort);
                break;
            case 4:
                Comparators.maxMeet fourthSort = new Comparators.maxMeet();
                array.sort(fourthSort);
                break;
        }
    }
}
