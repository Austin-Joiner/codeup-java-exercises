package oop_deeper_lectures;

public class Employee {

    //ALL employees will have some kind of a identity
    private String name;

static int headcount = 0;

    public  void sayHello() {
        System.out.printf("Hello there my name is: %s%n", this.name);
    }

    public Employee(String name) {
        this.name = name;
        headcount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
