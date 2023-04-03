package oop_deeper_lectures;

public class Company {

// to run something we need entry point into our application


    public static void main(String[] args) {


        Salesperson salesBot = new Salesperson("Robbo Bot 2000");
        Maintainceperson fixBot = new Maintainceperson("fix bot 50000");

        salesBot.sayHello();
        salesBot.doWork();
        System.out.println("daily pay: " + salesBot.getDailyPay());


        fixBot.sayHello();
        fixBot.doWork(); // subclass doWork from maintenanceperson class
        System.out.println("daily pay: " + fixBot.getDailyPay());


        System.out.printf("how many people work here? %d%n", Employee.headcount);
        System.out.printf("how many people work in the sales department? %d%n", Salesperson.saleCount);
        System.out.printf("how many people work in the Maintenance department? %d%n", Maintainceperson.maintainCount);

    }
}