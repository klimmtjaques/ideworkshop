package com.jambit.ideworkshop.model;

import java.util.ArrayList;
import java.util.List;

public class Stable {
    private List<Cow> cows = new ArrayList<>();

    public List<Cow> getCows() {
        return cows;
    }

    public int getMilkLiters() {
        return cows.stream()
                .mapToInt(Cow::getMilkLiters)
                .sum();
    }

}
