package org.szpax.brothers.difficulty;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DifficultyEvaluatorStep {

    public static void main(String[] args) {
        DifficultyEvaluatorStep des = new DifficultyEvaluatorStep();
        des.showStream();
    }

    public void showStream() {
        List<String> users = new ArrayList<String>();
        users.add("Piotrek");
        users.add("Mateusz");
        users.add("Marcin");

        List<String> collect = users.stream()
                .map(it -> it + "_1")
                .filter(it -> it.contains("Ma"))
                .collect(Collectors.toList());

        for(String s: collect) {
            System.out.println(s);
        }
    }
}
