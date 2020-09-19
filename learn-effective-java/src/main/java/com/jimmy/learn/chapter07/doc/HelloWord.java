package com.jimmy.learn.chapter07.doc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class HelloWord {

    /**
     * @param args input arguments
     */
    public static void main(String[] args) throws IllegalAccessException {
        int a = min(1,2,3);
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(a);
        System.out.println(Arrays.toString(list.toArray()));
    }

    /**
     * <p> This method is get <b>min</b> integer in variable integer arrays </p>
     *
     * @param args input arguments {@code args.length >=0},{@literal args.length>=0}
     * @return the min integer in args
     * @throws IllegalAccessException
     */
    public static int min(int... args) throws IllegalAccessException {
        if (args.length == 0)
            throw new IllegalAccessException("Too few arguments");
        int min = args[0];
        for (int i : args) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
