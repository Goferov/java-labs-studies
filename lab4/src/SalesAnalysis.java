package lab4.src;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

public class SalesAnalysis {
    public static void main(String[] args) {
        String filePath = "lab4/src/sales_data_sample.csv";

        try (Stream<String> lines = Files.lines(Paths.get(filePath), Charset.forName("Cp1250"))) {
            lines.skip(1) // Pomijanie nagłówka, jeśli istnieje
                    .map(line -> line.split(","))
                    .filter(tokens -> tokens.length > 1)
                    .map(tokens -> new Transaction(tokens[0], Double.parseDouble(tokens[1])))
                    .sorted(Comparator.comparingDouble(Transaction::getAmount).reversed())
                    .limit(5)
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class Transaction {
        private String id;
        private double amount;

        public Transaction(String id, double amount) {
            this.id = id;
            this.amount = amount;
        }

        public double getAmount() {
            return amount;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "id='" + id + '\'' +
                    ", amount=" + amount +
                    '}';
        }
    }
}

