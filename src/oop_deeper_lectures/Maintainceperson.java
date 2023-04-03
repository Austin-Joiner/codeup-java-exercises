package oop_deeper_lectures;

public class Maintainceperson extends Employee {

    private int dailyPay = 200;

    static int maintainCount = 0;

    public Maintainceperson(String name) {
        super(name);
        maintainCount++;
    }

    public void doWork() {
        System.out.println("Work: checking facilities and repairing physical things - checking access and operations- lawn duties- washing cars on lot%n");
    }

    public int getDailyPay() {
        return dailyPay;
    }

    @Override
    public void sayHello() {
        System.out.println();
        System.out.printf("Hi, I am %s I am maintainence i cant help you", this.getName());
        System.out.println();
    }
}
