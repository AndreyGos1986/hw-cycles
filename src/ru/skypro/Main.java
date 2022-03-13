package ru.skypro;

public class Main {

    public static void main(String[] args) {

        System.out.println("ЗАДАЧА №1");


        int point = 1;
        while (point <= 10) {
            System.out.print(point + " ");
            point++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }


        System.out.println();
        System.out.println();
        System.out.println("ЗАДАЧА №2");

        int firstFriday = 4; //первая пятница марта - 4 марта 2022
        int daysAWeek = 7;
        for (int i = firstFriday; i < 31; i = i + daysAWeek) {
            System.out.println("Сегодня пятница," + i + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println();
        System.out.println();
        System.out.println("ЗАДАЧА №3");

        int currentYear = 2022;      // добавлено
        int yearBefore = currentYear - 200;
        int yearAfter = currentYear + 100;

        for (int i = 0; i < yearAfter; i = i + 79) {      // немного изменено
            if (i > yearBefore && i < yearAfter) {  // немного изменено
                System.out.println(i);
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("ЗАДАЧА №4");

        String pi = "ping";
        String po = "pong";

        for (int i = 1; i <= 30; i++) { // <=30 прописал, чтобы вывелся последний пинг-понг))
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i + ":");
            }
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(i + ":" + pi);
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println(i + ":" + po);
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ":" + pi + " " + po);
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("ЗАДАЧА №5");

        int fibNum1 = 0;
        int fibNum2 = 1;
        int fibNum3;
        System.out.print(fibNum1 + "," + fibNum2 + ", ");

        for (int i = 1; i < 10; i++) {
            fibNum3 = fibNum1 + fibNum2;
            System.out.print(fibNum3 + ", ");
            fibNum1 = fibNum2;
            fibNum2 = fibNum3;
        }

        System.out.println();
        System.out.println();
        System.out.println("ЗАДАЧА №6");

        int clientAge = 22;
        int clientSalary = 80000;
        double creditLimit;


        if (clientAge >= 23) {
            if (clientSalary >= 50000 && clientSalary < 80000) {
                creditLimit = (clientSalary * 3) * 1.2;
                System.out.println(creditLimit);

            } else if (clientSalary >= 80000) {
                    creditLimit = (clientSalary * 3) * 1.5;
                    System.out.println("Максимально доступный кредитный лимит составляет: " + creditLimit);
                } else if (clientSalary <50000) {
                System.out.println("Вы нищий, Вам надо работать больше!!!");
            }
        }

        if (clientAge < 23) {
            if (clientSalary >= 50000 && clientSalary < 80000) {
                creditLimit = (clientSalary * 2) * 1.2;
                System.out.println("Максимально доступный кредитный лимит составляет: " + creditLimit);
            } else if (clientSalary >= 80000) {
                creditLimit = (clientSalary * 2) * 1.5;
                System.out.println("Максимально доступный кредитный лимит составляет: " + creditLimit);
            } else if (clientSalary < 50000) {
                System.out.println("Вы нищий, Вам надо работать больше!!!)))");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("ЗАДАЧА №7");

        clientAge = 25;
        clientSalary = 60000;

        int creditPeriod=12;
        double bRate = 10;
        int wantedSumm = 330000;
        double maxPay=(clientSalary*50/100);
        double procPerMonth=((bRate/100/12)*wantedSumm);
        double payPerMonth = wantedSumm/12;
        double payPerMonthWithPerc = payPerMonth+procPerMonth;

        System.out.println();
        System.out.println("Максимально доупустимый ежемесячный платёж, в соответствии с уровнем дохода составляет: " + maxPay+'\n');


        if (payPerMonthWithPerc>=maxPay) {
            System.out.println("Кредит не одобрен в связи с недостачным уровнем дохода");
        }

        if (payPerMonth < maxPay) {

            if (clientAge < 23) {
                bRate += 1;
                if (clientSalary < 80000) {
                    procPerMonth = ((bRate / 100 / creditPeriod) * wantedSumm);
                    System.out.println("Кредит одобрен со ставкой, равной: " + bRate + " и ежемесячным платежом, равным: " + (procPerMonth + payPerMonth));
                } else if (clientSalary >= 80000) {
                    bRate -= 0.7;
                    procPerMonth = ((bRate / 100 / creditPeriod) * wantedSumm);
                    System.out.println("Кредит одобрен со ставкой, равной: " + bRate + " и ежемесячным платежом, равным: " + (procPerMonth + payPerMonth));
                }
            }
            if (clientAge < 30 && clientAge >= 23) {
                bRate += 0.5;
                if (clientSalary < 80000) {
                    procPerMonth = ((bRate / 100 / creditPeriod) * wantedSumm);
                    System.out.println("Кредит одобрен со ставкой, равной: " + bRate + " и ежемесячным платежом, равным: " + (procPerMonth + payPerMonth));
                } else if (clientSalary >= 80000) {
                    bRate -= 0.7;
                    procPerMonth = ((bRate / 100 / creditPeriod) * wantedSumm);
                    System.out.println("Кредит одобрен со ставкой, равной: " + bRate + " и ежемесячным платежом, равным: " + (procPerMonth + payPerMonth));
                }
            }
        }


    }
}


