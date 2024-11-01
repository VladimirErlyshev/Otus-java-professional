package ru.verlyshev;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.List;

public class HelloOtus {
    public static void main(String[] args) {
        var stings = List.of("1", "2", "guava");
        Multiset<String> ms = HashMultiset.create();
        ms.addAll(stings);
        System.out.println("Success");
    }
}
