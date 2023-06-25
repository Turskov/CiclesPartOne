package ru.netology.services.CiclesPartOne.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RestServiceTest {
    @ParameterizedTest
    @CsvSource({
            "10000, 3000, 20000, 3",
            "100000, 60000, 150000, 2"
    })
    public void should(int income, int expenses, int threshold, long expected) {
        RestService service = new RestService();

        // int income = 10000;
        // int expenses = 3000;
        // int threshold = 20000;
        // long expected = 3;

        long actual = service.calculateRestMonths(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
