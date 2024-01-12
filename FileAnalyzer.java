import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileAnalyzer {
    public static void main(String[] args) {
        String filePath = "./sales_data_sample.csv";

        try {
            List<String> topTransactions = Files.lines(Paths.get(filePath), StandardCharsets.ISO_8859_1) // lub StandardCharsets.Windows-1252
                    .skip(1) // Pomijamy nagłówek
                    .map(line -> line.split(","))
                    .filter(tokens -> tokens.length > 4 && isNumeric(tokens[4]))
                    .sorted(Comparator.comparingDouble(tokens -> -Double.parseDouble(tokens[4])))
                    .limit(5)
                    .map(tokens -> String.join(", ", tokens))
                    .toList();

            topTransactions.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
}
