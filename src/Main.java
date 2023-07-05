public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
        while (year<10){
            population=population+((17-8)*(population/1000));
            year++;
            System.out.println("Год "+year+" , численность населения составляет "+population);
                    }
    }
}