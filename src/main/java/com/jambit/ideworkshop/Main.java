package com.jambit.ideworkshop;

import com.jambit.ideworkshop.model.Cow;

public class Main
{

    public static final int START_AGE = 0;

    public static void main(String[] args)
    {

        new Cow(START_AGE, "", Cow.MilkType.REGULAR);
        Cow cow = new Cow(2, "Berta", Cow.MilkType.REGULAR);

        Cow cow2 = new Cow(2, "Berta", Cow.MilkType.CHOCOLATE);
        printGoatFacts(cow);
        printGoatFacts(cow2);
        System.out.println("Cows are equal " + (cow.equals(cow2)));
    }

    private static void printGoatFacts(Cow cow)
    {
        System.out.println("My cow is " + cow);
        System.out.println("My cow's age is " + cow.toString());
    }

}
