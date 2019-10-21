package pl.udemy;

import java.util.Comparator;
import java.util.List;

public class FP02Functional {


    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 4, 64, 32);
        System.out.println(printSumOfNumbers(numbers));
        System.out.println(printMaxNumber(numbers));
        List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker");

        printSortedList(courses);

    }


    private static int sum(Integer a, Integer b) {
        return a+b;
    }
    private static int printSumOfNumbers(List<Integer> numbers) {
        return numbers.stream()
//                .reduce(0,FP02Functional::sum);
//                .reduce(0, (x, y) -> x + y);
                .reduce(0, Integer::sum);
    }

    private static int printMaxNumber(List<Integer> numbers) {
        return numbers.stream()
//                .reduce(0,FP02Functional::sum);
//                .reduce(0, (x, y) -> x + y);
                .reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x : y);
    }

    private static void printSortedList(List<String> numbers) {
         numbers.stream()
//                .reduce(0,FP02Functional::sum);
//                .reduce(0, (x, y) -> x + y);
//                .sorted()
                 .sorted(Comparator.reverseOrder())
                 .forEach(System.out::println);
    }


}
