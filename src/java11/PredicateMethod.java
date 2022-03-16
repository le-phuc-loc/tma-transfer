package java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateMethod {
    public static void main(String[] args) {
        List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ", "\nLe Phuc Loc");
        List withoutBlanks = sampleList.stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());
        System.out.println(withoutBlanks);
    }
}
