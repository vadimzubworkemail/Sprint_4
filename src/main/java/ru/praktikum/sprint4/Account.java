package ru.praktikum.sprint4;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        boolean result =  name.length() >= 3 && name.length() <= 19 && name.matches("^\\S+\\s\\S+$");
        System.out.println(name + " : " + result);
        return result;
    }

}
