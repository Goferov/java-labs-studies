package lab4.src;

import java.util.Random;
import java.util.stream.IntStream;

public class NumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < 10000; i++) {
            int number = random.nextInt(10);
            numbers[number]++;
        }

        System.out.println("Wystąpienia w kolejności naturalnej:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + ": " + numbers[i]);
        }

        System.out.println("\nWystąpienia w kolejności malejącej:");
        IntStream.range(0, numbers.length)
                .boxed()
                .sorted((i, j) -> numbers[j] - numbers[i])
                .forEach(i -> System.out.println(i + ": " + numbers[i]));
    }
}
