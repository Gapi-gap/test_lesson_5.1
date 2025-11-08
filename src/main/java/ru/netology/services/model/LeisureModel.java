package ru.netology.services.model;

public class LeisureModel {
    public int сalculatingTheMonthsInWhichAnEmployeeCanTakeVacation(int income, int expense, int threshold) {
        int amountOfTheMoneyAtTheMomemt = 0;
        int monthsOfRestCounter = 0;
        for (int i = 1; i <= 12; i++) {
            int dop = 0;
            if (amountOfTheMoneyAtTheMomemt >= threshold) {
                int savingsAfterMonthlyExpenses = amountOfTheMoneyAtTheMomemt - expense;
                double vacationExpenses = savingsAfterMonthlyExpenses - (int) (savingsAfterMonthlyExpenses / 3);
                amountOfTheMoneyAtTheMomemt = savingsAfterMonthlyExpenses - (int) vacationExpenses;
                monthsOfRestCounter++;
            } else {
                amountOfTheMoneyAtTheMomemt += income - expense;
            }
        }
        return monthsOfRestCounter;
    }
}
