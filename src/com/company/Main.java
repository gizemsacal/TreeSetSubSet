package com.company;

import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using subSet() with default boolean value
        System.out.println("Boole değeri olmadan subSet kullanma: " + numbers.subSet(4, 6));

        // Using subSet() with specified boolean value
        System.out.println("Boole değeriyle subSet kullanma: " + numbers.subSet(4, false, 6, true));
    }
}
