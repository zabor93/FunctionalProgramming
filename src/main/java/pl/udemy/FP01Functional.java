package pl.udemy;

import java.util.List;

public class FP01Functional {


    public static void main(String[] args) {

//        printAllNumbersInListFunctional(List.of(12, 9, 4, 64, 32));
//        printAllEvenNumbersInListFunctional(List.of(12,12,44,322,1,2,333,78));
        printAllCourses(List.of("Spring","Spring boot","API","Microservices","AWS","PCF","Azure","Docker"));

        printAllCoursesContaining4chars(List.of("Spring","Spring boot","API","Microservices","AWS","PCF","Azure","Docker"));
    }

    private static boolean isEven(Integer k) {
        return k % 2 == 0;
    }


    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(FP01Functional::isEven)
                .forEach(System.out::println);
    }

    private static void printAllEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number->number%2==0)
                .forEach(System.out::println);
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }
    private static void printAllCoursesContainingSpring(List<String> courses) {
        courses.stream()
                .filter(course->course.contains("Spring"))
                .forEach(System.out::println);
    }
    private static void printAllCoursesContaining4chars(List<String> courses) {
        courses.stream()
                .filter(course->course.length()>4)
                .forEach(System.out::println);
    }

}
