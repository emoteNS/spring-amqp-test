package com.test.test.Models;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by enrique on 17/07/17.
 */
public class AnimalBuilder {

    private static final String [] species = new String[]{"TIGER", "LION", "WOLF", "PANDA", "HORSE"};

    public static Animal getAnimal(){
        return new Animal( new Random().nextInt(10), species[new Random().nextInt(5)]);
    }
}
