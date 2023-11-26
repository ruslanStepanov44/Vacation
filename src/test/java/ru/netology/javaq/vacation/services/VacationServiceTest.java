package ru.netology.javaq.vacation.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class VacationServiceTest {

    @Test
      void testCalculate() {
        VacationService service = new VacationService();

        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(actual, expected);


    }


    @Test

     void testCalculate2() {
        VacationService service = new VacationService();

        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;


        Assertions.assertEquals(expected, actual);


    }
}

