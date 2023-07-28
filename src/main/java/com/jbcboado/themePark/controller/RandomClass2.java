package com.jbcboado.themePark.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomClass2 {

    public static void main(String[] args) {

        StrFormatter sf = s -> s.trim().toLowerCase();

        List<String> strList = Arrays.asList("Jon", "mayA", "Mary", "   Anne", "d", null, "Anthony", "Maya", "mary", "jOhn");
        List<String> output = new ArrayList<>();
        strList.stream().filter(s -> (s!=null && !s.isBlank())).forEach(s -> output.add(sf.formatStr(s)));
        output.stream().distinct().sorted().forEach(s -> System.out.println(s));
    }

    @FunctionalInterface
    interface StrFormatter{
        String formatStr(String s);
    }

}
