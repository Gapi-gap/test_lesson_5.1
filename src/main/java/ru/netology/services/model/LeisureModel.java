package ru.netology.services.model;

public class LeisureModel {
    public int PrintLeisureModel(int income, int expense, int threshold) {
        int sumMoney = 0;
        int count = 0;
        for (int i = 1; i <= 12; i++) {
            //String jobPposting = "Придется работать";
            int informationAboutMoneyNumber = income;
            //  String informationAboutMoneyStr = "Заработал ";
            int spent = expense;
            if (sumMoney >= threshold) {
                // jobPposting = "Буду отдыхать";
                informationAboutMoneyNumber = -expense;
                //informationAboutMoneyStr = "Потратил ";
                double thirdPart = (double) (sumMoney - expense) / 3;
                spent = sumMoney - expense - (int) thirdPart;
                count++;
            }


            //System.out.println("Месяц " + i + ". Денег" + sumMoney + ". " + jobPposting + ". " + informationAboutMoneyStr + informationAboutMoneyNumber + ", потратил -" + spent);
            sumMoney += informationAboutMoneyNumber - spent;
        }
        return count;
    }
}
