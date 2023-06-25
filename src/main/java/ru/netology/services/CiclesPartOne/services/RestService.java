package ru.netology.services.CiclesPartOne.services;

public class RestService {
    public int calculateRestMonths(int income, int expenses, int threshold) {
        int count = 0; // количество отдыха
        int money = 0; // количество денег

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { //можем ли мы отдыхать
                count++;
                money = ((money - expenses) / 3);
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
