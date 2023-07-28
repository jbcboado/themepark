package com.jbcboado.themePark.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RandomClass {

    public static void main(String[] args) {
//        List<Integer> myList = new ArrayList<>(List.of(3,5,1,7,9,2));
//
//        Integer[] arr = {3,5,1,7,9,2};
//
//        sort(arr, 0, arr.length);

//        String ss = "random";
//        MyInterface mi =  s -> {
//            StringBuilder returnVal = new StringBuilder();
//            for (int i = 0; i < s.length(); i++) {
//                if (i % 2 == 1) {
//                    returnVal.append(s.charAt(i));
//                }
//            }
//            return returnVal.toString();
//        };
//       // Function<String, String> lambdaFunction =
//
//        System.out.println(mi.modify("random"));
//        Arrays.asList(s.toCharArray()).stream().
//
//        System.out.println(returnVal.toString());

        Person p3 = new Person("zzz name");

        Person p2 = new Person();

        System.out.println(p2.getName());
       Person p = new Person("updated name");




        System.out.println(p.getName());


    }

    public int solution(int[] A) {
        int tmp = -1;
        if(A.length == 1){
            return A[0];
        } else if(A.length > 1){
            List<Integer> intList = Arrays.stream(A).boxed().collect(Collectors.toList());
            List<Integer> dupes = new ArrayList<>();
            for(int i = 0; i<A.length; i++){
                //   int tmp = intList.get(i);
                //   intList.set(i, -1);

                //   if(intList.contains(tmp) == false) return tmp;

                //   else intList.set(i, tmp);

                if(i == intList.lastIndexOf(A[i]) && !dupes.contains(A[i]))                     return A[i];
                else dupes.add(A[i]);
            }
        }

        return -1;
    }

    @FunctionalInterface
    interface MyInterface{
        String modify(String str);
    }

    static void sort(Integer arr[], int l, int r){
        if(l<r){
            int m = l+(r-1)/2;

            sort(arr, l, m);
            sort(arr,m+1, r);

            merge(arr, l, m, r);
        }
    }

    static void merge(Integer[] arr, int l, int m, int  r){
        System.out.println("Im doing nothing.");
    }

}


class Person{
     private static String name = "test";

    Person(String name){
        this.name = name;
    }

    Person(){

    }

    public String getName(){
        return this.name;
    }
}



