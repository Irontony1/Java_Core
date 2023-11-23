package ru.jcore.regular;

import java.util.Random;

public class Randomizer {
    /**
     * Функция создания рандомных целочисленных переменных
     * @return вохаращает число типа int
     */
    public static int randomInt() {
        Random number = new Random();
        return number.nextInt(1,10);
    }
}
