package ru.praktikum.sprint4;

import io.qameta.allure.Description;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    private final boolean result;

    public AccountTest(String name, boolean result) {
        this.name = name;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getNameData() {
        return new Object[][]{
                {"Тимоти Шаламе", true},
                {"Т Ш", true},
                {"ТШ", false},
                {"Тимоти Шаламефапрол", true},
                {"Тимоти Шаламефапролд", false},
                {"Тимоти Ша ламе", false},
                {" ТимотиШаламе", false},
                {"ТимотиШаламе ", false},
        };
    }

    @Description("Проверяем, что метод возвращает корректный результат")
    @Test

    public void validatingAName() {
        Account account = new Account(name);
        Assert.assertEquals(result, account.checkNameToEmboss());

    }
}
