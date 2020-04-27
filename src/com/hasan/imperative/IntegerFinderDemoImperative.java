package com.hasan.imperative;

import java.util.Arrays;
import java.util.List;

public class IntegerFinderDemoImperative {

    public static void main(String[] args) {
        // write your code here

        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        finds(ints, 8);

    }

    private static void finds(List<Integer> ints, int num) {
        boolean found = false;

        for (Integer integer : ints) {
            if (integer.equals(num)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(num + " found");
        } else {
            System.out.println(num + " not found.");
        }
    }

}
