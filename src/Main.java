public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int cash = 0;
        int month = 0;
        while (cash < 2_459_000) {
            cash += 15000;
            month++;
        }
        System.out.println("Месяц " + month + " сумма накоплений равна " + cash + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + "\s");
        }
        System.out.print("\n");
        for (; i > 0; i--) {
            System.out.print(i + "\s");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 0;
        int population = 12_000_000;
        int born = 17;
        int death = 8;
        while (year < 10) {
            population = population + ((17 - 8) * (population / 1000));
            year++;
            System.out.println("Год " + year + " , численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int cash = 15_000;
        int total = 0;
        int penny = 0;
        int month = 0;
        while (total < 12_000_000) {
            penny = (total / 100) * 7;
            total = total + cash + penny;
            month++;
            System.out.println("Месяц " + month + " - накопил " + total);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int cash = 15_000;
        int total = 0;
        int penny = 0;
        int month = 0;
        while (total < 12_000_000) {
            penny = (total / 100) * 7;
            total = total + cash + penny;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " - накопил " + total);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int cash = 15_000;
        int total = 0;
        int penny = 0;
        int month = 0;
        while (month < 9 * 12) {
            penny = (total / 100) * 7;
            total = total + cash + penny;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " -накопил" + total);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 3;
        while (friday <= 31) {
            System.out.println("сегодня пятница " + friday + "-e число");
            friday += 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 0;
        int cycle = 79;
        while (year <= 2123) {
            year = year + cycle;
            if (year > (2023 - 200) && year < (2023 + 100)) {
                System.out.println(year);
            }
        }
    }
}