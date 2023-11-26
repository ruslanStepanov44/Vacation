package ru.netology.javaq.vacation.services;

public class VacationService {

    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int relaxMonths = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                money = (money - expenses) / 3;
                relaxMonths++;
            } else {
                money += income - expenses;
            }
        }
        return relaxMonths;
    }
}
