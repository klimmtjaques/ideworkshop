package com.jambit.ideworkshop.model;

import java.util.Objects;

public class Cow extends Animal {

    /**
     * Constructs a cow
     * <p>
     * Age must be greater than 0
     *
     * @param age  The age of the cow
     * @param name The name of the cow
     */
    public Cow(int age, String name) {
        super(age, name);
    }

    @Override
    String makeNoise() {
        return "Baa";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Cow cow = (Cow) o;
        return age == cow.age && name.equals(cow.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Cow{" + "age=" + age + '}';
    }

    public int getMilkLiters() {
        return 2 * age;
    }
}
