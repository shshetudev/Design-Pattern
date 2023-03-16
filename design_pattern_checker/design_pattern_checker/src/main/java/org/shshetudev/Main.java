package org.shshetudev;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        System.out.println(xx("//"));
        List<String> optionPlanList = Arrays.asList(
                "{\"OPP-006\": {\"type\":\"1\", \"contract_start_date\": null}}",
                "{\"OPP-006\": {\"type\":\"1\", \"contract_start_date\": null}}"
        );
        String jsonString = optionPlanList.stream().map(Objects::toString).collect(Collectors.joining(","));
//        String jsonString = optionPlanList.toString().replace("[","").replace("]", "");
        System.out.println(jsonString);
    }

    public static List<Integer> xx(String yy) {
        return Arrays.stream(yy.split("/"))
                .filter(s -> s.matches("\\d+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}