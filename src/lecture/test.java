package lecture;

public class test {

    public static void main(String[] args) {
        Vehicle kensTruck = new Vehicle("chevy", "silverador", "blue", 2019, 14234);

//       System.out.printf("%s", kensTruck.serial); // private without getter doesnt work
        System.out.printf("%s", kensTruck.getSerial()); // with getter
    }
}
