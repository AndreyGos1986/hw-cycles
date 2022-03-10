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
        for (int i = 4; i < 31; i = i + 7) {
            System.out.println("Сегодня пятница," + i + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println();
        System.out.println();
        System.out.println("ЗАДАЧА №3");

        int currentYear=2022;      // добавлено
        int yearBefore = currentYear - 200;
        int yearAfter = currentYear + 100;

        for (int i = 0; i < yearAfter; i = i + 79) {      // немного изменено
            if (i > yearBefore && i < yearAfter) {  // немного изменено
                System.out.println(i);
            } else if (i > yearBefore && i < yearAfter) {  // добавлено
                System.out.println(i);
            } else if (i > yearBefore && i < yearAfter) { // добавлено
                System.out.println(i);
            }

        }
    }
}


