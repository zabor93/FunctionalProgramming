package pl.udemy;

import java.awt.*;
import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {

        printAllNumbersInListStructured(List.of(12, 9, 4, 64, 32));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
