package com.test.java8;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by bairong on 2018/5/21.
 */
public class StreamDemo {

    public static void main(String[] args) {


        List<String> languages = Arrays.asList("java", "scala", "python");
        //before java8
//        for (String each : languages) {
//            System.out.println(each);
//        }
//        after java8
        languages.forEach(x -> System.out.println(x));
        languages.forEach(System.out::println);
        languages.forEach(x -> System.out.println(x));

        //lambda map
        List<Double> cost = Arrays.asList(10.0, 20.0, 30.0);
        cost.stream().map(x -> x + x * 0.05).forEach(x -> System.out.println(x));
        CollectionUtils.isEmpty()

        //lambda reduce
//        List<Double> cost = Arrays.asList(10.0, 20.0, 30.0);
//        double allcost = cost.stream().map(x -> x + x * 0.05).reduce((sum, x) -> sum + x).get();
//        System.out.println(allcost);

        //filter
//        List<Double> cost = Arrays.asList(10.0, 20.0,30.0,40.0);
//        List<Double> filteredCost = cost.stream().filter(x -> x > 25.0).collect(Collectors.toList());
//        filteredCost.forEach(x -> System.out.println(x));

    }

}
