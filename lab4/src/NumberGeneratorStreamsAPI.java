package lab4.src;

import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberGeneratorStreamsAPI {
    public static void main(String[] args) {
        Map<Integer, Long> numbers = new Random().ints(10000, 0, 10)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Wystąpienia w kolejności naturalnej:");
        numbers.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        System.out.println("\nWystąpienia w kolejności malejącej:");
        numbers.entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
