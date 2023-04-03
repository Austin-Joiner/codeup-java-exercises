package oop_deeper_lectures;

public class Salesperson extends Employee { // needs to inherit employee class, do this by extending

    private int dailyPay = 500;

    static int saleCount = 0;

    public  Salesperson(String name) {
        super(name);
        saleCount++;
    }


    public void doWork(){
        System.out.println("Work: Burning and turning the phone - setting up appts - catching some fdresh to sell car%n");
    }

    public int getDailyPay() {
        return dailyPay;
    }

    @Override
    public void sayHello() {
        System.out.println();
        System.out.printf("Welcome, my name is %s what can sales help you find today", this.getName());
        System.out.println();
    }
}
