package com.tretiakovdim.app.homework.lesson17;

/**
 * Created by DmitryTretiakov on 30.11.2016.
 * <p>
 * <p>
 * **Реализовать игру “Угадай-ка”, которая будет выводить случайным образом ФИО одного из известных людей и
 * предлагать пользователю ввести его возраст. В случае совпадения - выводим пользователю поздравление,
 * в противном случае - сообщаем что он неправ и выводим случайным образом ФИО другого известного человека.
 * ФИО не должно повторяться два раза подряд.
 * Задачу можно усложнить, спрашивая у пользователя не только возраст, а также то - жив ли этот человек или уже нет.
 * Игра должна завершаться после трех угаданных людей. Список людей с ФИО, их возрастами и статусами жизни должен находится в enum.
 */
public enum Guessing {

    STALIN(1878, " Joseph Stalin ", true), ZINOVIEV(1898, " Grigory Zinoviev ", true), RFMENEV(1877, " Lev Kamenev ", true), LENIN(1870, " Vladimir Lenin ", true), KRUPSKAYA(1871, " Nadezhda Krupskaya ", true),

    KHRUSHCHEV(1901, " Nikita Khrushchev ", true), TROTSKY(1888, " Leon Trotsky ", true), PUGACHEVA(1956, " Alla Pugacheva ", false);

    private int yearOfBirth;
    private String fullName;
    private boolean rip, playPosition;

    public void setPlayPosition(boolean playPosition) {
        this.playPosition = playPosition;
    }

    public boolean isPlayPosition() {
        return playPosition;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String isRip() {
        if (rip == true) {
            return "NOT";
        } else return "YES";
    }

    public String getFullName() {
        return fullName;
    }

    private Guessing(int yearOfBirth, String fullName, boolean rip) {
        this.yearOfBirth = yearOfBirth;
        this.fullName = fullName;
        this.rip = rip;
        this.playPosition = false;
    }


}
