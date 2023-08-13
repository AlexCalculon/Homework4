public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();



    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 15;

        if (age > 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Несовершеннолетний");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = 15;

        if (temperature < 5) {
            System.out.println("Нужно надевать шапку");
        } else {
            System.out.println("Не нужно надевать шапку");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 90;

        if (speed > 60) {
            System.out.println("Штраф!");
        } else {
            System.out.println("Можно ехать спокойно");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int age = 15;

        if (age <= 2 && age <= 6) {
            System.out.println("Детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Школа");
        }else if (age >18 && age <24) {
            System.out.println("Работа");
        } else if (age >= 24){
            System.out.println("Работа");

        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int age = 13;

        if (age < 5) {
            System.out.println("Не может кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Может кататься только в сопровождении взрослого");
        } else if (age >= 14) {
            System.out.println("Может кататься без сопровождения взрослого");
            
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int capacity = 102;
        int seatPlaces = 60;

        int peopleNumber = 70;

        if (peopleNumber == capacity) {
            System.out.println("Вагон полностью забит");
        } else if (peopleNumber < seatPlaces) {
            System.out.println("Есть сидячее место");
        } else {
            System.out.println("Есть стоячее место");

        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int one = 10, two = 20, three =30;


        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);

        }
    }
}

