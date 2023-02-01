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
    public static void task1 () {
        System.out.println("Задача 1");
        byte a = 14;
        short b = 1000;
        int c = 45000;
        long d = 1234567890L;
        float e = 20.0f;
        double f = 34.75;
        System.out.println("Значение переменной с типом byte равно " + a);
        System.out.println("Значение переменной с типом short равно " + b);
        System.out.println("Значение переменной с типом int равно " + c);
        System.out.println("Значение переменной с типом long равно " + d);
        System.out.println("Значение переменной с типом float равно " + e);
        System.out.println("Значение переменной с типом double равно " + f);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        byte a = 67;
        short b = -159;
        int c = 569;
        int d = 27897;
        long e = 987678965549L;
        float f = 27.12f;
        double g = 2.786;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int lpStudents = 23;
        int asStudents = 27;
        int eaStudents = 30;
        int totalPages = 480;
        int totalStudents = lpStudents + asStudents + eaStudents;
        int countOfPagesPerStudent = totalPages / totalStudents;
        System.out.println("На каждого ученика рассчитано " + countOfPagesPerStudent + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int countBottles = 16;
        int perTime = 2;
        int countBottlesPerMinute = countBottles / perTime;
        int time1 = 20;
        int countBottles1 = countBottlesPerMinute * time1;
        System.out.println("За 20 минут машина произвела " + countBottles1 + " бутылок");
        int hoursPerDay = 24;
        int minutesPerHour = 60;
        int minutesPerDay = minutesPerHour * hoursPerDay;
        int countBottlesPerDay = countBottlesPerMinute * minutesPerDay;
        System.out.println("За день машина произвела " + countBottlesPerDay + " бутылок");
        int minutesPerThreeDays = minutesPerDay * 3;
        int countBottlesPerThreeDays = countBottlesPerMinute * minutesPerThreeDays;
        System.out.println("За три дня машина произвела " + countBottlesPerThreeDays + " бутылок");
        int minutesPerMonth = minutesPerDay * 30;
        int countBottlesPerMonth = countBottlesPerMinute * minutesPerMonth;
        System.out.println("За месяц машина произвела " + countBottlesPerMonth + " бутылок");

    }
    public static void task5 () {
        System.out.println("Задача 5");
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalCansPerClass = whiteCansPerClass + brownCansPerClass;
        int totalClasses = totalCans / totalCansPerClass;
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int totalBananasWeight = 80 * 5;
        int totalMilkWeight =  105 * 2;
        int totalIceCreamWeight = 100 * 2;
        int totalEggsWeight =  70 * 4;
        double totalWeight = totalBananasWeight + totalMilkWeight + totalIceCreamWeight + totalEggsWeight;
        System.out.println("вес завтрака в граммах равен " + totalWeight + " г");
        double totalWeightKg = totalWeight / 1000;
        System.out.println("вес завтрака в килограммах равен " + totalWeightKg + " кг");




    }
    public static void task7 (){
        System.out.println("Задача 7");
        int LowestWeightPerDay = 250;
        int HighestWeightPerDay = 500;
        int countWeight = 7000;
        int countHighestDays = countWeight / LowestWeightPerDay;
        System.out.println("При потере в 250 грамм в день на похудение уйдёт " + countHighestDays + " дней");
        int countLowestDays = countWeight / HighestWeightPerDay;
        System.out.println("При потере в 500 грамм в день на похудение уйдёт " + countLowestDays + " дней");
        int averageDays = (countHighestDays + countLowestDays) / 2;
        System.out.println("В среднем на похудение уйдёт " + averageDays + " дней");

    }
    public static void task8 () {
        System.out.println("Задача 8");
        int MashaSalary = 67760;
        int DenisSalary = 83690;
        int KrisSalary = 76230;
        int MashaSalaryPerYear = MashaSalary * 12;
        int DenisSalaryPerYear = DenisSalary * 12;
        int KrisSalaryPerYear = KrisSalary * 12;
        int MashaSalaryAfterPromotion = MashaSalary + (MashaSalary / 10);
        int DenisSalaryAfterPromotion = DenisSalary + (DenisSalary / 10);
        int KrisSalaryAfterPromotion = KrisSalary + (KrisSalary / 10);
        int MashaSalaryPerYearAfterPromotion = MashaSalaryAfterPromotion * 12;
        int DenisSalaryPerYearAfterPromotion = DenisSalaryAfterPromotion * 12;
        int KrisSalaryPerYearAfterPromotion = KrisSalaryAfterPromotion * 12;
        System.out.println("Маша теперь получает " + MashaSalaryAfterPromotion + " в месяц, годовой доход вырос на " + (MashaSalaryPerYearAfterPromotion - MashaSalaryPerYear) + " рублей");
        System.out.println("Денис теперь получает " + DenisSalaryAfterPromotion + " в месяц, годовой доход вырос на " + (DenisSalaryPerYearAfterPromotion - DenisSalaryPerYear) + " рублей");
        System.out.println("Кристина теперь получает " + KrisSalaryAfterPromotion + " в месяц, годовой доход вырос на " + (KrisSalaryPerYearAfterPromotion - KrisSalaryPerYear) + " рублей");
    }
}