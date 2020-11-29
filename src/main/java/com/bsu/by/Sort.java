package com.bsu.by;

import java.util.ArrayList;
import java.util.Comparator;

class Sort extends Thread {
    public int sortNumber;

    public Sort(int sortNumber) {
        this.sortNumber = sortNumber;
    }

    public void run(ArrayList<Integer> array) {
        switch (sortNumber) {
            case 1 -> array.sort((o1, o2) -> o2 - o1);
            case 2 -> array.sort(Comparator.comparingInt(o -> o));
            case 3 -> array.sort(((o1, o2) -> o2.toString().length() - o1.toString().length()));
            case 4 -> array.sort((Comparator.comparingInt(o -> o.toString().length())));
        }
    }
}
