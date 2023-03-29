package lecture;

public class Vehicle {

    public String model;
    public String make;
    public String color;
    public int year;
    private int serial;





    public Vehicle(String make, String model, String color, int year, int serial){//initializing method
        this.model = model;
        this.make = make;
        this.color = color;
        this.year = year;
        this.serial = serial;
    }

    public int getSerial() {
        return serial;
    }

    public String turnOn() {
        return "The " + make + " " + model + " is now on.";
    }
    public String turnSerial() {
        return "The " + make + " " + model + " is now on." + serial;
    }

    public static void main (String[]args){
        Vehicle kensTruck = new Vehicle("Chevy", "Silverado", "teal", 2016, 1002912);

        Vehicle kens2Truck = new Vehicle("Jeep", "Wrangler", "brown", 2017, 1002913);

        Vehicle kens3Truck = new Vehicle("ford", "mustang", "red", 2019, 1002914);

        Vehicle kens4Truck = new Vehicle("Lambo", "Diablo", "orange", 2023, 1002915);


//        System.out.println(kensTruck.turnOn());
//        System.out.println(kens2Truck.turnOn());
//        System.out.println(kens3Truck.turnOn());
//        System.out.println(kens4Truck.turnOn());

            System.out.printf("%s", kensTruck.model);
//        System.out.println(kensTruck.turnSerial());
//        System.out.println(kens2Truck.turnSerial());
//        System.out.println(kens3Truck.turnSerial());
//        System.out.println(kens4Truck.turnSerial());
    }

}
