package java11.string;

import java.util.List;
import java.util.stream.Collectors;

public class StringMain {
    public static void main(String[] args) {
        String multilineString = "Deft helps \n \n developers \n explore Java.";
        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());
        System.out.println(lines);

        System.out.println("loc".repeat(4));
        System.out.println(" ".isBlank());
        System.out.println(" ".strip().isEmpty());
        System.out.println("  bla  bla  ".stripLeading());
        System.out.println("  bla  bla  ".stripTrailing());
        System.out.println("  bla  bla  ".stripIndent());
        "loc\ncan tho".lines().forEach(System.out::println);
    }
}
