package oop_deeper_lectures;

public class Company {

// to run something we need entry point into our application


    public static void main(String[] args) {

        Salesperson salesBot = new Salesperson("Robbo Bot 2000", 1450);
        Salesperson newSalesBot = new Salesperson("New ROBBO bot 2023", 450);
        Maintainceperson fixBot = new Maintainceperson("fix bot 50000", 1000);

        salesBot.sayHello();
        salesBot.doWork();
        System.out.println("daily pay: " + salesBot.getDailyPay());

        newSalesBot.sayHello();
        newSalesBot.doWork();
        System.out.println("daily pay: " + newSalesBot.getDailyPay());

        fixBot.sayHello();
        fixBot.doWork(); // subclass doWork from maintenanceperson class
        System.out.println("daily pay: " + fixBot.getDailyPay());

        System.out.printf("how many people work here? %d%n", Employee.headcount);
        System.out.printf("how many people work in the sales department? %d%n", Salesperson.saleCount);
        System.out.printf("how many people work in the Maintenance department? %d%n", Maintainceperson.maintainCount);

        System.out.println();
        System.out.println();
        System.out.println();


        //          POLYMORPHS
        // creates a new employee of no specific type
        Employee employeeExamplePoly = new Employee("exampleName");
        System.out.println("employeeExamplePoly.getName() = " + employeeExamplePoly.getName());


        // creates a new sales person
        Employee polymorphingVariable = new Salesperson("saleExamplePoly", 100);

        employeeExamplePoly.sayHello();
        polymorphingVariable.sayHello();

        System.out.println("new employee head count for company: " + Employee.headcount);
        System.out.println("new employee head count for Sales: " + Salesperson.saleCount);
        System.out.println("new employee head count for Maintaince: " + Maintainceperson.maintainCount);


    }
}