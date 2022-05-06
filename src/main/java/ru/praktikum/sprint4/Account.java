package ru.praktikum.sprint4;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        return name.length() >= 3 && name.length() <= 13 && name.matches("^\\S + \\s + \\S + $");
    }

}
