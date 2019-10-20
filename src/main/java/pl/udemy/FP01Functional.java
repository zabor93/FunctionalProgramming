package pl.udemy;

import java.util.List;

public class FP01Functional {


    public static void main(String[] args) {

        printAllNumbersInListFunctional(List.of(12, 9, 4, 64, 32));
    }

    private static boolean isEven(Integer k) {
        return k%2==0;
    }


    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(FP01Functional::isEven)
                .forEach(System.out::println);
        }
}
