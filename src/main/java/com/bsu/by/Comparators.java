package com.bsu.by;

import java.util.Comparator;

class Comparators {
    static class minInt implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    }

    static class maxInt implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }

    static class maxMeet implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            int numSumFirst = 0;
            int numFirst = o1;
            int numSecond = o2;
            for (; numFirst != 0; numFirst /= 10) {
                numSumFirst++;
            }
            int numSumSecond = 0;
            for (; numSecond != 0; numSecond /= 10) {
                numSumSecond++;
            }
            return numSumSecond - numSumFirst;
        }
    }

    static class minMeet implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            int numSumFirst = 0;
            int numFirst = o1;
            int numSecond = o2;
            for (; numFirst != 0; numFirst /= 10) {
                numSumFirst++;
            }
            int numSumSecond = 0;
            for (; numSecond != 0; numSecond /= 10) {
                numSumSecond++;
            }
            return numSumFirst - numSumSecond;
        }
    }
}
