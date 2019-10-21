package pl.udemy;

import java.util.List;

public class FP02Structured {

    public static void main(String[] args) {

        List<Integer> list = List.of(12, 9, 4, 64, 32);
        System.out.println(printSumofList(list));;
    }

    private static int printSumofList(List<Integer> numbers) {
        int sum=0;
        for (int number : numbers) {
            sum+=number;
        }
        return sum;
    }
}
